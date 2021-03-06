// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb;

import java.nio.*;
import java.lang.*;
import java.util.*;
import com.google.flatbuffers.*;

@SuppressWarnings("unused")
public final class Signature extends Table {
  public static Signature getRootAsSignature(ByteBuffer _bb) { return getRootAsSignature(_bb, new Signature()); }
  public static Signature getRootAsSignature(ByteBuffer _bb, Signature obj) { _bb.order(ByteOrder.LITTLE_ENDIAN); return (obj.__assign(_bb.getInt(_bb.position()) + _bb.position(), _bb)); }
  public void __init(int _i, ByteBuffer _bb) { bb_pos = _i; bb = _bb; vtable_start = bb_pos - bb.getInt(bb_pos); vtable_size = bb.getShort(vtable_start); }
  public Signature __assign(int _i, ByteBuffer _bb) { __init(_i, _bb); return this; }

  public UInt256 r() { return r(new UInt256()); }
  public UInt256 r(UInt256 obj) { int o = __offset(4); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public UInt256 s() { return s(new UInt256()); }
  public UInt256 s(UInt256 obj) { int o = __offset(6); return o != 0 ? obj.__assign(__indirect(o + bb_pos), bb) : null; }
  public byte recId() { int o = __offset(8); return o != 0 ? bb.get(o + bb_pos) : 0; }

  public static int createSignature(FlatBufferBuilder builder,
      int rOffset,
      int sOffset,
      byte recId) {
    builder.startObject(3);
    Signature.addS(builder, sOffset);
    Signature.addR(builder, rOffset);
    Signature.addRecId(builder, recId);
    return Signature.endSignature(builder);
  }

  public static void startSignature(FlatBufferBuilder builder) { builder.startObject(3); }
  public static void addR(FlatBufferBuilder builder, int rOffset) { builder.addOffset(0, rOffset, 0); }
  public static void addS(FlatBufferBuilder builder, int sOffset) { builder.addOffset(1, sOffset, 0); }
  public static void addRecId(FlatBufferBuilder builder, byte recId) { builder.addByte(2, recId, 0); }
  public static int endSignature(FlatBufferBuilder builder) {
    int o = builder.endObject();
    return o;
  }
}

