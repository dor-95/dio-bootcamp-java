package main.java.map.ordenacao;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.eventosMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        new TreeMap<>(eventosMap).forEach(
                (key, value) -> System.out.format("""
                        Data do Evento: %s | Evento: %s | Atração: %s
                        """, key.format(DateTimeFormatter.ofPattern("dd.MM.yyyy"))
                        , value.getNome()
                        , value.getAtracao())
        );
    }

    public void obterProximoEvento() {
        LocalDate dataAtual = LocalDate.now();
        for (Map.Entry<LocalDate, Evento> entry : eventosMap.entrySet()) {
            if (entry.getKey().isAfter(dataAtual) || entry.getKey().isEqual(dataAtual)) {
                LocalDate proximaData = entry.getKey();
                Evento proximoEvento = entry.getValue();
                System.out.format("O próximo evento: %s com atração %s acontecerá na data %s",
                        proximoEvento.getNome(), proximoEvento.getAtracao(), proximaData);
                return;
            }
        }
    }
}

class AgendaEventosTest {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        // Adicionando eventos na agenda
        agendaEventos.adicionarEvento(LocalDate.of(2023, 9, 30), "Evento 1", "Atração 4");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 8, 12), "Evento 2", "Atração 3");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 7, 6), "Evento 3", "Atração 2");
        agendaEventos.adicionarEvento(LocalDate.of(2023, 1, 27), "Evento 4", "Atração 1");

        // Exibindo agenda de eventos
        agendaEventos.exibirAgenda();
        System.out.println("-----------------------------");

        // Exibi o evento posterior mais próximo da data atual
        agendaEventos.obterProximoEvento();
    }
}
