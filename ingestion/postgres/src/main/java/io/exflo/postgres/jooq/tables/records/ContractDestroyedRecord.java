/*
 * This file is generated by jOOQ.
 */
package io.exflo.postgres.jooq.tables.records;


import io.exflo.postgres.jooq.tables.ContractDestroyed;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.12.3"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class ContractDestroyedRecord extends UpdatableRecordImpl<ContractDestroyedRecord> implements Record7<String, String, BigDecimal, String, Long, String, Timestamp> {

    private static final long serialVersionUID = -600130902;

    /**
     * Setter for <code>public.contract_destroyed.address</code>.
     */
    public ContractDestroyedRecord setAddress(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.address</code>.
     */
    public String getAddress() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.contract_destroyed.refund_address</code>.
     */
    public ContractDestroyedRecord setRefundAddress(String value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.refund_address</code>.
     */
    public String getRefundAddress() {
        return (String) get(1);
    }

    /**
     * Setter for <code>public.contract_destroyed.refund_amount</code>.
     */
    public ContractDestroyedRecord setRefundAmount(BigDecimal value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.refund_amount</code>.
     */
    public BigDecimal getRefundAmount() {
        return (BigDecimal) get(2);
    }

    /**
     * Setter for <code>public.contract_destroyed.block_hash</code>.
     */
    public ContractDestroyedRecord setBlockHash(String value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.block_hash</code>.
     */
    public String getBlockHash() {
        return (String) get(3);
    }

    /**
     * Setter for <code>public.contract_destroyed.block_number</code>.
     */
    public ContractDestroyedRecord setBlockNumber(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.block_number</code>.
     */
    public Long getBlockNumber() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.contract_destroyed.transaction_hash</code>.
     */
    public ContractDestroyedRecord setTransactionHash(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.transaction_hash</code>.
     */
    public String getTransactionHash() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.contract_destroyed.timestamp</code>.
     */
    public ContractDestroyedRecord setTimestamp(Timestamp value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.contract_destroyed.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record2<String, String> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row7<String, String, BigDecimal, String, Long, String, Timestamp> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    @Override
    public Row7<String, String, BigDecimal, String, Long, String, Timestamp> valuesRow() {
        return (Row7) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return ContractDestroyed.CONTRACT_DESTROYED.ADDRESS;
    }

    @Override
    public Field<String> field2() {
        return ContractDestroyed.CONTRACT_DESTROYED.REFUND_ADDRESS;
    }

    @Override
    public Field<BigDecimal> field3() {
        return ContractDestroyed.CONTRACT_DESTROYED.REFUND_AMOUNT;
    }

    @Override
    public Field<String> field4() {
        return ContractDestroyed.CONTRACT_DESTROYED.BLOCK_HASH;
    }

    @Override
    public Field<Long> field5() {
        return ContractDestroyed.CONTRACT_DESTROYED.BLOCK_NUMBER;
    }

    @Override
    public Field<String> field6() {
        return ContractDestroyed.CONTRACT_DESTROYED.TRANSACTION_HASH;
    }

    @Override
    public Field<Timestamp> field7() {
        return ContractDestroyed.CONTRACT_DESTROYED.TIMESTAMP;
    }

    @Override
    public String component1() {
        return getAddress();
    }

    @Override
    public String component2() {
        return getRefundAddress();
    }

    @Override
    public BigDecimal component3() {
        return getRefundAmount();
    }

    @Override
    public String component4() {
        return getBlockHash();
    }

    @Override
    public Long component5() {
        return getBlockNumber();
    }

    @Override
    public String component6() {
        return getTransactionHash();
    }

    @Override
    public Timestamp component7() {
        return getTimestamp();
    }

    @Override
    public String value1() {
        return getAddress();
    }

    @Override
    public String value2() {
        return getRefundAddress();
    }

    @Override
    public BigDecimal value3() {
        return getRefundAmount();
    }

    @Override
    public String value4() {
        return getBlockHash();
    }

    @Override
    public Long value5() {
        return getBlockNumber();
    }

    @Override
    public String value6() {
        return getTransactionHash();
    }

    @Override
    public Timestamp value7() {
        return getTimestamp();
    }

    @Override
    public ContractDestroyedRecord value1(String value) {
        setAddress(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord value2(String value) {
        setRefundAddress(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord value3(BigDecimal value) {
        setRefundAmount(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord value4(String value) {
        setBlockHash(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord value5(Long value) {
        setBlockNumber(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord value6(String value) {
        setTransactionHash(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord value7(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public ContractDestroyedRecord values(String value1, String value2, BigDecimal value3, String value4, Long value5, String value6, Timestamp value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached ContractDestroyedRecord
     */
    public ContractDestroyedRecord() {
        super(ContractDestroyed.CONTRACT_DESTROYED);
    }

    /**
     * Create a detached, initialised ContractDestroyedRecord
     */
    public ContractDestroyedRecord(String address, String refundAddress, BigDecimal refundAmount, String blockHash, Long blockNumber, String transactionHash, Timestamp timestamp) {
        super(ContractDestroyed.CONTRACT_DESTROYED);

        set(0, address);
        set(1, refundAddress);
        set(2, refundAmount);
        set(3, blockHash);
        set(4, blockNumber);
        set(5, transactionHash);
        set(6, timestamp);
    }
}
