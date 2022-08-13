package com.monkey;

import lombok.*;

import javax.persistence.*;
import java.util.UUID;

@Entity
@Table(name = "bucket_list")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BucketList {

    @Id
    @GeneratedValue
    @Column(name = "id",updatable = false)
    @EqualsAndHashCode.Exclude @ToString.Exclude
    private UUID id;

    private String name;

    private  String description;

    @Override
    public String toString() {
        return "BucketList{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
