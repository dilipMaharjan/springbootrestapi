/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootstarter.repository;

import com.bootstarter.model.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dmaharjan
 */
@Repository
public interface TopicRepository extends CrudRepository<Topic, Long> {
}
