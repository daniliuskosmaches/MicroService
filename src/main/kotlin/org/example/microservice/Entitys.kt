package org.example.microservice

import jakarta.persistence.Entity
import jakarta.persistence.Id
import lombok.Data

@Entity
@Data
class Entitys(@Id var id: Long? = null, val name: String){

}
