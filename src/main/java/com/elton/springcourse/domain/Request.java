package com.elton.springcourse.domain;

import com.elton.springcourse.domain.enums.RequestState;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity(name = "request")
public class Request implements Serializable {


    private static final long serialVersionUID = -1799860543319980528L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(length = 75, nullable = false)
    private String subject;

    @Column(columnDefinition = "text")
    private String description;

    @Column(name = "creation_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date creationDate;

    @Column(length = 12, nullable = false)
    @Enumerated(EnumType.STRING)
    private RequestState state;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private User owner; // owner = proprietário

    @OneToMany(mappedBy = "request")
    private List<RequestStage> stage = new ArrayList<RequestStage>();

}
