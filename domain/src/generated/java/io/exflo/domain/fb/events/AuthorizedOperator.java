// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb.events;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class AuthorizedOperator extends Table {
  public static AuthorizedOperator getRootAsAuthorizedOperator(ByteBuffer _bb) { return getRootAsAuthorizedOperator(_bb, new AuthorizedOperator()); }
  public static AuthorizedOperator getRootAsAuthorizedOperator(ByteBuffer _bb, AuthorizedOperator obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public AuthorizedOperator __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public io.exflo.domain.fb.Bytes20 contract() { return contract(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 contract(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 operator() { return operator(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 operator(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public io.exflo.domain.fb.Bytes20 holder() { return holder(new io.exflo.domain.fb.Bytes20()); }
  public io.exflo.domain.fb.Bytes20 holder(io.exflo.domain.fb.Bytes20 obj) { int o = __offset(8); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }

  public static int createAuthorizedOperator(FlatBufferBuilder builder,
      int contractOffset,
      int operatorOffset,
      int holderOffset) {
    builder.startObject(3);
    AuthorizedOperator.addHolder(builder, holderOffset);
    AuthorizedOperator.addOperator(builder, operatorOffset);
    AuthorizedOperator.addContract(builder, contractOffset);
    return AuthorizedOperator.endAuthorizedOperator(builder);
  }

  public static void startAuthorizedOperator(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addContract(FlatBufferBuilder builder, int contractOffset) { builder.addOffset(0, contractOffset, 0); }
  public static void addOperator(FlatBufferBuilder builder, int operatorOffset) { builder.addOffset(1, operatorOffset, 0); }
  public static void addHolder(FlatBufferBuilder builder, int holderOffset) { builder.addOffset(2, holderOffset, 0); }
  public static int endAuthorizedOperator(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

