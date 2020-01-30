/*
 * This file is generated by jOOQ.
 */
package io.exflo.postgres.jooq.tables.records;


import io.exflo.postgres.jooq.tables.Transaction;

import java.math.BigDecimal;
import java.sql.Timestamp;

import javax.annotation.processing.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record18;
import org.jooq.Row18;
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
public class TransactionRecord extends UpdatableRecordImpl<TransactionRecord> implements Record18<String, Long, String, Integer, Long, String, String, BigDecimal, BigDecimal, Long, byte[], BigDecimal, BigDecimal, Short, BigDecimal, BigDecimal, String, Timestamp> {

    private static final long serialVersionUID = 356086641;

    /**
     * Setter for <code>public.transaction.hash</code>.
     */
    public TransactionRecord setHash(String value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.hash</code>.
     */
    public String getHash() {
        return (String) get(0);
    }

    /**
     * Setter for <code>public.transaction.block_number</code>.
     */
    public TransactionRecord setBlockNumber(Long value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.block_number</code>.
     */
    public Long getBlockNumber() {
        return (Long) get(1);
    }

    /**
     * Setter for <code>public.transaction.block_hash</code>.
     */
    public TransactionRecord setBlockHash(String value) {
        set(2, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.block_hash</code>.
     */
    public String getBlockHash() {
        return (String) get(2);
    }

    /**
     * Setter for <code>public.transaction.index</code>.
     */
    public TransactionRecord setIndex(Integer value) {
        set(3, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.index</code>.
     */
    public Integer getIndex() {
        return (Integer) get(3);
    }

    /**
     * Setter for <code>public.transaction.nonce</code>.
     */
    public TransactionRecord setNonce(Long value) {
        set(4, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.nonce</code>.
     */
    public Long getNonce() {
        return (Long) get(4);
    }

    /**
     * Setter for <code>public.transaction.from</code>.
     */
    public TransactionRecord setFrom(String value) {
        set(5, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.from</code>.
     */
    public String getFrom() {
        return (String) get(5);
    }

    /**
     * Setter for <code>public.transaction.to</code>.
     */
    public TransactionRecord setTo(String value) {
        set(6, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.to</code>.
     */
    public String getTo() {
        return (String) get(6);
    }

    /**
     * Setter for <code>public.transaction.value</code>.
     */
    public TransactionRecord setValue(BigDecimal value) {
        set(7, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.value</code>.
     */
    public BigDecimal getValue() {
        return (BigDecimal) get(7);
    }

    /**
     * Setter for <code>public.transaction.gas_price</code>.
     */
    public TransactionRecord setGasPrice(BigDecimal value) {
        set(8, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.gas_price</code>.
     */
    public BigDecimal getGasPrice() {
        return (BigDecimal) get(8);
    }

    /**
     * Setter for <code>public.transaction.gas_limit</code>.
     */
    public TransactionRecord setGasLimit(Long value) {
        set(9, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.gas_limit</code>.
     */
    public Long getGasLimit() {
        return (Long) get(9);
    }

    /**
     * Setter for <code>public.transaction.payload</code>.
     */
    public TransactionRecord setPayload(byte... value) {
        set(10, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.payload</code>.
     */
    public byte[] getPayload() {
        return (byte[]) get(10);
    }

    /**
     * Setter for <code>public.transaction.chain_id</code>.
     */
    public TransactionRecord setChainId(BigDecimal value) {
        set(11, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.chain_id</code>.
     */
    public BigDecimal getChainId() {
        return (BigDecimal) get(11);
    }

    /**
     * Setter for <code>public.transaction.fee</code>.
     */
    public TransactionRecord setFee(BigDecimal value) {
        set(12, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.fee</code>.
     */
    public BigDecimal getFee() {
        return (BigDecimal) get(12);
    }

    /**
     * Setter for <code>public.transaction.rec_id</code>.
     */
    public TransactionRecord setRecId(Short value) {
        set(13, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.rec_id</code>.
     */
    public Short getRecId() {
        return (Short) get(13);
    }

    /**
     * Setter for <code>public.transaction.r</code>.
     */
    public TransactionRecord setR(BigDecimal value) {
        set(14, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.r</code>.
     */
    public BigDecimal getR() {
        return (BigDecimal) get(14);
    }

    /**
     * Setter for <code>public.transaction.s</code>.
     */
    public TransactionRecord setS(BigDecimal value) {
        set(15, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.s</code>.
     */
    public BigDecimal getS() {
        return (BigDecimal) get(15);
    }

    /**
     * Setter for <code>public.transaction.contract_address</code>.
     */
    public TransactionRecord setContractAddress(String value) {
        set(16, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.contract_address</code>.
     */
    public String getContractAddress() {
        return (String) get(16);
    }

    /**
     * Setter for <code>public.transaction.timestamp</code>.
     */
    public TransactionRecord setTimestamp(Timestamp value) {
        set(17, value);
        return this;
    }

    /**
     * Getter for <code>public.transaction.timestamp</code>.
     */
    public Timestamp getTimestamp() {
        return (Timestamp) get(17);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record18 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row18<String, Long, String, Integer, Long, String, String, BigDecimal, BigDecimal, Long, byte[], BigDecimal, BigDecimal, Short, BigDecimal, BigDecimal, String, Timestamp> fieldsRow() {
        return (Row18) super.fieldsRow();
    }

    @Override
    public Row18<String, Long, String, Integer, Long, String, String, BigDecimal, BigDecimal, Long, byte[], BigDecimal, BigDecimal, Short, BigDecimal, BigDecimal, String, Timestamp> valuesRow() {
        return (Row18) super.valuesRow();
    }

    @Override
    public Field<String> field1() {
        return Transaction.TRANSACTION.HASH;
    }

    @Override
    public Field<Long> field2() {
        return Transaction.TRANSACTION.BLOCK_NUMBER;
    }

    @Override
    public Field<String> field3() {
        return Transaction.TRANSACTION.BLOCK_HASH;
    }

    @Override
    public Field<Integer> field4() {
        return Transaction.TRANSACTION.INDEX;
    }

    @Override
    public Field<Long> field5() {
        return Transaction.TRANSACTION.NONCE;
    }

    @Override
    public Field<String> field6() {
        return Transaction.TRANSACTION.FROM;
    }

    @Override
    public Field<String> field7() {
        return Transaction.TRANSACTION.TO;
    }

    @Override
    public Field<BigDecimal> field8() {
        return Transaction.TRANSACTION.VALUE;
    }

    @Override
    public Field<BigDecimal> field9() {
        return Transaction.TRANSACTION.GAS_PRICE;
    }

    @Override
    public Field<Long> field10() {
        return Transaction.TRANSACTION.GAS_LIMIT;
    }

    @Override
    public Field<byte[]> field11() {
        return Transaction.TRANSACTION.PAYLOAD;
    }

    @Override
    public Field<BigDecimal> field12() {
        return Transaction.TRANSACTION.CHAIN_ID;
    }

    @Override
    public Field<BigDecimal> field13() {
        return Transaction.TRANSACTION.FEE;
    }

    @Override
    public Field<Short> field14() {
        return Transaction.TRANSACTION.REC_ID;
    }

    @Override
    public Field<BigDecimal> field15() {
        return Transaction.TRANSACTION.R;
    }

    @Override
    public Field<BigDecimal> field16() {
        return Transaction.TRANSACTION.S;
    }

    @Override
    public Field<String> field17() {
        return Transaction.TRANSACTION.CONTRACT_ADDRESS;
    }

    @Override
    public Field<Timestamp> field18() {
        return Transaction.TRANSACTION.TIMESTAMP;
    }

    @Override
    public String component1() {
        return getHash();
    }

    @Override
    public Long component2() {
        return getBlockNumber();
    }

    @Override
    public String component3() {
        return getBlockHash();
    }

    @Override
    public Integer component4() {
        return getIndex();
    }

    @Override
    public Long component5() {
        return getNonce();
    }

    @Override
    public String component6() {
        return getFrom();
    }

    @Override
    public String component7() {
        return getTo();
    }

    @Override
    public BigDecimal component8() {
        return getValue();
    }

    @Override
    public BigDecimal component9() {
        return getGasPrice();
    }

    @Override
    public Long component10() {
        return getGasLimit();
    }

    @Override
    public byte[] component11() {
        return getPayload();
    }

    @Override
    public BigDecimal component12() {
        return getChainId();
    }

    @Override
    public BigDecimal component13() {
        return getFee();
    }

    @Override
    public Short component14() {
        return getRecId();
    }

    @Override
    public BigDecimal component15() {
        return getR();
    }

    @Override
    public BigDecimal component16() {
        return getS();
    }

    @Override
    public String component17() {
        return getContractAddress();
    }

    @Override
    public Timestamp component18() {
        return getTimestamp();
    }

    @Override
    public String value1() {
        return getHash();
    }

    @Override
    public Long value2() {
        return getBlockNumber();
    }

    @Override
    public String value3() {
        return getBlockHash();
    }

    @Override
    public Integer value4() {
        return getIndex();
    }

    @Override
    public Long value5() {
        return getNonce();
    }

    @Override
    public String value6() {
        return getFrom();
    }

    @Override
    public String value7() {
        return getTo();
    }

    @Override
    public BigDecimal value8() {
        return getValue();
    }

    @Override
    public BigDecimal value9() {
        return getGasPrice();
    }

    @Override
    public Long value10() {
        return getGasLimit();
    }

    @Override
    public byte[] value11() {
        return getPayload();
    }

    @Override
    public BigDecimal value12() {
        return getChainId();
    }

    @Override
    public BigDecimal value13() {
        return getFee();
    }

    @Override
    public Short value14() {
        return getRecId();
    }

    @Override
    public BigDecimal value15() {
        return getR();
    }

    @Override
    public BigDecimal value16() {
        return getS();
    }

    @Override
    public String value17() {
        return getContractAddress();
    }

    @Override
    public Timestamp value18() {
        return getTimestamp();
    }

    @Override
    public TransactionRecord value1(String value) {
        setHash(value);
        return this;
    }

    @Override
    public TransactionRecord value2(Long value) {
        setBlockNumber(value);
        return this;
    }

    @Override
    public TransactionRecord value3(String value) {
        setBlockHash(value);
        return this;
    }

    @Override
    public TransactionRecord value4(Integer value) {
        setIndex(value);
        return this;
    }

    @Override
    public TransactionRecord value5(Long value) {
        setNonce(value);
        return this;
    }

    @Override
    public TransactionRecord value6(String value) {
        setFrom(value);
        return this;
    }

    @Override
    public TransactionRecord value7(String value) {
        setTo(value);
        return this;
    }

    @Override
    public TransactionRecord value8(BigDecimal value) {
        setValue(value);
        return this;
    }

    @Override
    public TransactionRecord value9(BigDecimal value) {
        setGasPrice(value);
        return this;
    }

    @Override
    public TransactionRecord value10(Long value) {
        setGasLimit(value);
        return this;
    }

    @Override
    public TransactionRecord value11(byte... value) {
        setPayload(value);
        return this;
    }

    @Override
    public TransactionRecord value12(BigDecimal value) {
        setChainId(value);
        return this;
    }

    @Override
    public TransactionRecord value13(BigDecimal value) {
        setFee(value);
        return this;
    }

    @Override
    public TransactionRecord value14(Short value) {
        setRecId(value);
        return this;
    }

    @Override
    public TransactionRecord value15(BigDecimal value) {
        setR(value);
        return this;
    }

    @Override
    public TransactionRecord value16(BigDecimal value) {
        setS(value);
        return this;
    }

    @Override
    public TransactionRecord value17(String value) {
        setContractAddress(value);
        return this;
    }

    @Override
    public TransactionRecord value18(Timestamp value) {
        setTimestamp(value);
        return this;
    }

    @Override
    public TransactionRecord values(String value1, Long value2, String value3, Integer value4, Long value5, String value6, String value7, BigDecimal value8, BigDecimal value9, Long value10, byte[] value11, BigDecimal value12, BigDecimal value13, Short value14, BigDecimal value15, BigDecimal value16, String value17, Timestamp value18) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        value12(value12);
        value13(value13);
        value14(value14);
        value15(value15);
        value16(value16);
        value17(value17);
        value18(value18);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached TransactionRecord
     */
    public TransactionRecord() {
        super(Transaction.TRANSACTION);
    }

    /**
     * Create a detached, initialised TransactionRecord
     */
    public TransactionRecord(String hash, Long blockNumber, String blockHash, Integer index, Long nonce, String from, String to, BigDecimal value, BigDecimal gasPrice, Long gasLimit, byte[] payload, BigDecimal chainId, BigDecimal fee, Short recId, BigDecimal r, BigDecimal s, String contractAddress, Timestamp timestamp) {
        super(Transaction.TRANSACTION);

        set(0, hash);
        set(1, blockNumber);
        set(2, blockHash);
        set(3, index);
        set(4, nonce);
        set(5, from);
        set(6, to);
        set(7, value);
        set(8, gasPrice);
        set(9, gasLimit);
        set(10, payload);
        set(11, chainId);
        set(12, fee);
        set(13, recId);
        set(14, r);
        set(15, s);
        set(16, contractAddress);
        set(17, timestamp);
    }
}
