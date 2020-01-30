// automatically generated by the FlatBuffers compiler, do not modify

package io.exflo.domain.fb.events;

public final class ContractEvent {
  private ContractEvent() { }
  public static final byte NONE = 0;
  public static final byte FungibleApproval = 1;
  public static final byte FungibleTransfer = 2;
  public static final byte NonFungibleApproval = 3;
  public static final byte ApprovalForAll = 4;
  public static final byte NonFungibleTransfer = 5;
  public static final byte Sent = 6;
  public static final byte Minted = 7;
  public static final byte Burned = 8;
  public static final byte AuthorizedOperator = 9;
  public static final byte RevokedOperator = 10;
  public static final byte TransferSingle = 11;
  public static final byte TransferBatch = 12;
  public static final byte URI = 13;

  public static final String[] names = { "NONE", "FungibleApproval", "FungibleTransfer", "NonFungibleApproval", "ApprovalForAll", "NonFungibleTransfer", "Sent", "Minted", "Burned", "AuthorizedOperator", "RevokedOperator", "TransferSingle", "TransferBatch", "URI", };

  public static String name(int e) { return names[e]; }
}

