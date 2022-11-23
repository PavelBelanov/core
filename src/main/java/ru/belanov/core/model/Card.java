package ru.belanov.core.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cards")
@EqualsAndHashCode(of= {"id"})
public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long rating;
    @ManyToOne
    private EnWord enWord;
    @ManyToOne
    private RuWord ruWord;
}
