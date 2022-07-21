package com.autograph.album;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;


public interface AlbumRepository extends MongoRepository<Album, String> {


}
