package com.sandon.multi.api.infrastructure.database.repositories;

import com.sandon.multi.api.domain.Dummy;
import com.sandon.multi.api.domain.DummyRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public class DummyJpaRepository implements JpaRepository<Dummy, Long>, DummyRepository {

  @Override
  public Dummy save(Dummy dummy) {
    return null;
  }

  @Override
  public List<Dummy> findAll() {
    return null;
  }

  @Override
  public List<Dummy> findAll(Sort sort) {
    return null;
  }

  @Override
  public Page<Dummy> findAll(Pageable pageable) {
    return null;
  }

  @Override
  public List<Dummy> findAllById(Iterable<Long> longs) {
    return null;
  }

  @Override
  public long count() {
    return 0;
  }

  @Override
  public void deleteById(Long aLong) {

  }

  @Override
  public void delete(Dummy entity) {

  }

  @Override
  public void deleteAllById(Iterable<? extends Long> longs) {

  }

  @Override
  public void deleteAll(Iterable<? extends Dummy> entities) {

  }

  @Override
  public void deleteAll() {

  }

  @Override
  public <S extends Dummy> List<S> saveAll(Iterable<S> entities) {
    return null;
  }

  @Override
  public Optional<Dummy> findById(Long aLong) {
    return Optional.empty();
  }

  @Override
  public boolean existsById(Long aLong) {
    return false;
  }

  @Override
  public void flush() {

  }

  @Override
  public <S extends Dummy> S saveAndFlush(S entity) {
    return null;
  }

  @Override
  public <S extends Dummy> List<S> saveAllAndFlush(Iterable<S> entities) {
    return null;
  }

  @Override
  public void deleteAllInBatch(Iterable<Dummy> entities) {

  }

  @Override
  public void deleteAllByIdInBatch(Iterable<Long> longs) {

  }

  @Override
  public void deleteAllInBatch() {

  }

  @Override
  public Dummy getOne(Long aLong) {
    return null;
  }

  @Override
  public Dummy getById(Long aLong) {
    return null;
  }

  @Override
  public <S extends Dummy> Optional<S> findOne(Example<S> example) {
    return Optional.empty();
  }

  @Override
  public <S extends Dummy> List<S> findAll(Example<S> example) {
    return null;
  }

  @Override
  public <S extends Dummy> List<S> findAll(Example<S> example, Sort sort) {
    return null;
  }

  @Override
  public <S extends Dummy> Page<S> findAll(Example<S> example, Pageable pageable) {
    return null;
  }

  @Override
  public <S extends Dummy> long count(Example<S> example) {
    return 0;
  }

  @Override
  public <S extends Dummy> boolean exists(Example<S> example) {
    return false;
  }
}
