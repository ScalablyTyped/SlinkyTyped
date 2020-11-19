package typingsSlinky.web3Eth.mod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable3
import typingsSlinky.bignumberJs.mod.BigNumber
import typingsSlinky.bnJs.mod.^
import typingsSlinky.node.netMod.Socket
import typingsSlinky.web3Core.mod.BlockNumber
import typingsSlinky.web3Core.mod.Common
import typingsSlinky.web3Core.mod.Extension
import typingsSlinky.web3Core.mod.Log
import typingsSlinky.web3Core.mod.LogsOptions
import typingsSlinky.web3Core.mod.PastLogsOptions
import typingsSlinky.web3Core.mod.PromiEvent
import typingsSlinky.web3Core.mod.Providers
import typingsSlinky.web3Core.mod.RLPEncodedTransaction
import typingsSlinky.web3Core.mod.Transaction
import typingsSlinky.web3Core.mod.TransactionConfig
import typingsSlinky.web3Core.mod.TransactionReceipt
import typingsSlinky.web3Core.mod.chain
import typingsSlinky.web3Core.mod.hardfork
import typingsSlinky.web3CoreSubscriptions.mod.Subscription
import typingsSlinky.web3Eth.web3EthStrings.logs
import typingsSlinky.web3Eth.web3EthStrings.newBlockHeaders
import typingsSlinky.web3Eth.web3EthStrings.pendingTransactions
import typingsSlinky.web3Eth.web3EthStrings.syncing
import typingsSlinky.web3EthAbi.mod.AbiCoder
import typingsSlinky.web3EthAccounts.mod.Accounts
import typingsSlinky.web3EthContract.mod.ContractOptions
import typingsSlinky.web3EthEns.mod.Ens
import typingsSlinky.web3EthPersonal.mod.Personal
import typingsSlinky.web3Net.mod.Network
import typingsSlinky.web3Utils.mod.AbiItem
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("web3-eth", "Eth")
@js.native
class Eth () extends js.Object {
  def this(provider: typingsSlinky.web3Core.mod.provider) = this()
  def this(provider: typingsSlinky.web3Core.mod.provider, net: Socket) = this()
  
  var BatchRequest: Instantiable0[typingsSlinky.web3Core.mod.BatchRequest] = js.native
  
  var Contract: Instantiable3[
    /* jsonInterface */ js.Array[AbiItem] | AbiItem, 
    /* address */ js.UndefOr[String], 
    /* options */ js.UndefOr[ContractOptions], 
    typingsSlinky.web3EthContract.mod.Contract
  ] = js.native
  
  var Iban: Instantiable1[/* iban */ String, typingsSlinky.web3EthIban.mod.Iban] = js.native
  
  var abi: AbiCoder = js.native
  
  var accounts: Accounts = js.native
  
  def call(transactionConfig: TransactionConfig): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ js.Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  def call(transactionConfig: TransactionConfig, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def call(
    transactionConfig: TransactionConfig,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* data */ String, Unit]
  ): js.Promise[String] = js.native
  
  def clearSubscriptions(callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]): Unit = js.native
  
  val currentProvider: typingsSlinky.web3Core.mod.provider = js.native
  
  var defaultAccount: String | Null = js.native
  
  var defaultBlock: BlockNumber = js.native
  
  var defaultChain: chain = js.native
  
  var defaultCommon: Common = js.native
  
  var defaultHardfork: hardfork = js.native
  
  var ens: Ens = js.native
  
  def estimateGas(transactionConfig: TransactionConfig): js.Promise[Double] = js.native
  def estimateGas(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ js.Error, /* gas */ Double, Unit]
  ): js.Promise[Double] = js.native
  
  def extend(extension: Extension): js.Any = js.native
  
  def getAccounts(): js.Promise[js.Array[String]] = js.native
  def getAccounts(callback: js.Function2[/* error */ js.Error, /* accounts */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  
  def getBalance(address: String): js.Promise[String] = js.native
  def getBalance(address: String, callback: js.Function2[/* error */ js.Error, /* balance */ String, Unit]): js.Promise[String] = js.native
  def getBalance(address: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getBalance(
    address: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* balance */ String, Unit]
  ): js.Promise[String] = js.native
  
  def getBlock(blockHashOrBlockNumber: String): js.Promise[BlockTransactionString] = js.native
  def getBlock(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ js.Error, /* block */ BlockTransactionString, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getBlock(blockHashOrBlockNumber: String, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getBlock(
    blockHashOrBlockNumber: String,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* block */ BlockTransactionObject, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getBlock(blockHashOrBlockNumber: BlockNumber): js.Promise[BlockTransactionString] = js.native
  def getBlock(
    blockHashOrBlockNumber: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* block */ BlockTransactionString, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getBlock(blockHashOrBlockNumber: BlockNumber, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getBlock(
    blockHashOrBlockNumber: BlockNumber,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* block */ BlockTransactionObject, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  
  def getBlockNumber(): js.Promise[Double] = js.native
  def getBlockNumber(callback: js.Function2[/* error */ js.Error, /* blockNumber */ Double, Unit]): js.Promise[Double] = js.native
  
  def getBlockTransactionCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
  def getBlockTransactionCount(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ js.Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getBlockTransactionCount(blockHashOrBlockNumber: BlockNumber): js.Promise[Double] = js.native
  def getBlockTransactionCount(
    blockHashOrBlockNumber: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  
  def getBlockUncleCount(blockHashOrBlockNumber: String): js.Promise[Double] = js.native
  def getBlockUncleCount(
    blockHashOrBlockNumber: String,
    callback: js.Function2[/* error */ js.Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  def getBlockUncleCount(blockHashOrBlockNumber: BlockNumber): js.Promise[Double] = js.native
  def getBlockUncleCount(
    blockHashOrBlockNumber: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* numberOfTransactions */ Double, Unit]
  ): js.Promise[Double] = js.native
  
  def getChainId(): js.Promise[Double] = js.native
  def getChainId(callback: js.Function2[/* error */ js.Error, /* version */ Double, Unit]): js.Promise[Double] = js.native
  
  def getCode(address: String): js.Promise[String] = js.native
  def getCode(address: String, callback: js.Function2[/* error */ js.Error, /* code */ String, Unit]): js.Promise[String] = js.native
  def getCode(address: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getCode(
    address: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* code */ String, Unit]
  ): js.Promise[String] = js.native
  
  def getCoinbase(): js.Promise[String] = js.native
  def getCoinbase(callback: js.Function2[/* error */ js.Error, /* coinbaseAddress */ String, Unit]): js.Promise[String] = js.native
  
  def getGasPrice(): js.Promise[String] = js.native
  def getGasPrice(callback: js.Function2[/* error */ js.Error, /* gasPrice */ String, Unit]): js.Promise[String] = js.native
  
  def getHashrate(): js.Promise[Double] = js.native
  def getHashrate(callback: js.Function2[/* error */ js.Error, /* hashes */ Double, Unit]): js.Promise[Double] = js.native
  
  def getNodeInfo(): js.Promise[String] = js.native
  def getNodeInfo(callback: js.Function2[/* error */ js.Error, /* version */ String, Unit]): js.Promise[String] = js.native
  
  def getPastLogs(options: PastLogsOptions): js.Promise[js.Array[Log]] = js.native
  def getPastLogs(
    options: PastLogsOptions,
    callback: js.Function2[/* error */ js.Error, /* logs */ js.Array[Log], Unit]
  ): js.Promise[js.Array[Log]] = js.native
  
  def getPendingTransactions(): js.Promise[js.Array[Transaction]] = js.native
  def getPendingTransactions(callback: js.Function2[/* error */ js.Error, /* result */ js.Array[Transaction], Unit]): js.Promise[js.Array[Transaction]] = js.native
  
  def getProof(address: String, storageKey: js.Array[BigNumber | Double | String | ^ ], blockNumber: BlockNumber): js.Promise[GetProof] = js.native
  def getProof(
    address: String,
    storageKey: js.Array[BigNumber | Double | String | ^ ],
    blockNumber: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* result */ GetProof, Unit]
  ): js.Promise[GetProof] = js.native
  
  def getProtocolVersion(): js.Promise[String] = js.native
  def getProtocolVersion(callback: js.Function2[/* error */ js.Error, /* protocolVersion */ String, Unit]): js.Promise[String] = js.native
  
  def getStorageAt(address: String, position: String): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: String,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: String, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: Double, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: Double,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: BigNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: BigNumber,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: BigNumber, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: BigNumber,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: ^): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: ^,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  def getStorageAt(address: String, position: ^, defaultBlock: BlockNumber): js.Promise[String] = js.native
  def getStorageAt(
    address: String,
    position: ^,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* storageAt */ String, Unit]
  ): js.Promise[String] = js.native
  
  def getTransaction(transactionHash: String): js.Promise[Transaction] = js.native
  def getTransaction(
    transactionHash: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  
  def getTransactionCount(address: String): js.Promise[Double] = js.native
  def getTransactionCount(address: String, callback: js.Function2[/* error */ js.Error, /* count */ Double, Unit]): js.Promise[Double] = js.native
  def getTransactionCount(address: String, defaultBlock: BlockNumber): js.Promise[Double] = js.native
  def getTransactionCount(
    address: String,
    defaultBlock: BlockNumber,
    callback: js.Function2[/* error */ js.Error, /* count */ Double, Unit]
  ): js.Promise[Double] = js.native
  
  def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: String): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: String,
    indexNumber: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: String,
    indexNumber: Double,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: String, indexNumber: ^): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: String,
    indexNumber: ^,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: String): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: BlockNumber,
    indexNumber: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: Double): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: BlockNumber,
    indexNumber: Double,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(blockHashOrBlockNumber: BlockNumber, indexNumber: ^): js.Promise[Transaction] = js.native
  def getTransactionFromBlock(
    blockHashOrBlockNumber: BlockNumber,
    indexNumber: ^,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): js.Promise[Transaction] = js.native
  
  def getTransactionReceipt(hash: String): js.Promise[TransactionReceipt] = js.native
  def getTransactionReceipt(
    hash: String,
    callback: js.Function2[/* error */ js.Error, /* transactionReceipt */ TransactionReceipt, Unit]
  ): js.Promise[TransactionReceipt] = js.native
  
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: String): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: String,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: String, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: String,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: Double,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: ^): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: ^,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: String, uncleIndex: ^, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getUncle(
    blockHashOrBlockNumber: String,
    uncleIndex: ^,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: String): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: String,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: String, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: String,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: Double): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: Double,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: Double, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: Double,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: ^): js.Promise[BlockTransactionString] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: ^,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionString] = js.native
  def getUncle(blockHashOrBlockNumber: BlockNumber, uncleIndex: ^, returnTransactionObjects: Boolean): js.Promise[BlockTransactionObject] = js.native
  def getUncle(
    blockHashOrBlockNumber: BlockNumber,
    uncleIndex: ^,
    returnTransactionObjects: Boolean,
    callback: js.Function2[/* error */ js.Error, /* uncle */ js.Any, Unit]
  ): js.Promise[BlockTransactionObject] = js.native
  
  def getWork(): js.Promise[js.Array[String]] = js.native
  def getWork(callback: js.Function2[/* error */ js.Error, /* result */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  
  val givenProvider: js.Any = js.native
  
  var handleRevert: Boolean = js.native
  
  def isMining(): js.Promise[Boolean] = js.native
  def isMining(callback: js.Function2[/* error */ js.Error, /* mining */ Boolean, Unit]): js.Promise[Boolean] = js.native
  
  def isSyncing(): js.Promise[Syncing | Boolean] = js.native
  def isSyncing(callback: js.Function2[/* error */ js.Error, /* syncing */ Syncing, Unit]): js.Promise[Syncing | Boolean] = js.native
  
  var net: Network = js.native
  
  var personal: Personal = js.native
  
  def requestAccounts(): js.Promise[js.Array[String]] = js.native
  def requestAccounts(callback: js.Function2[/* error */ js.Error, /* result */ js.Array[String], Unit]): js.Promise[js.Array[String]] = js.native
  
  def sendSignedTransaction(signedTransactionData: String): PromiEvent[TransactionReceipt] = js.native
  def sendSignedTransaction(
    signedTransactionData: String,
    callback: js.Function2[/* error */ js.Error, /* hash */ String, Unit]
  ): PromiEvent[TransactionReceipt] = js.native
  
  def sendTransaction(transactionConfig: TransactionConfig): PromiEvent[TransactionReceipt] = js.native
  def sendTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ js.Error, /* hash */ String, Unit]
  ): PromiEvent[TransactionReceipt] = js.native
  
  def setProvider(provider: typingsSlinky.web3Core.mod.provider): Boolean = js.native
  
  def sign(dataToSign: String, address: String): js.Promise[String] = js.native
  def sign(
    dataToSign: String,
    address: String,
    callback: js.Function2[/* error */ js.Error, /* signature */ String, Unit]
  ): js.Promise[String] = js.native
  def sign(dataToSign: String, address: Double): js.Promise[String] = js.native
  def sign(
    dataToSign: String,
    address: Double,
    callback: js.Function2[/* error */ js.Error, /* signature */ String, Unit]
  ): js.Promise[String] = js.native
  
  def signTransaction(transactionConfig: TransactionConfig): js.Promise[RLPEncodedTransaction] = js.native
  def signTransaction(transactionConfig: TransactionConfig, address: String): js.Promise[RLPEncodedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    address: String,
    callback: js.Function2[/* error */ js.Error, /* signedTransaction */ RLPEncodedTransaction, Unit]
  ): js.Promise[RLPEncodedTransaction] = js.native
  def signTransaction(
    transactionConfig: TransactionConfig,
    callback: js.Function2[/* error */ js.Error, /* signedTransaction */ RLPEncodedTransaction, Unit]
  ): js.Promise[RLPEncodedTransaction] = js.native
  
  def submitWork(data: js.Tuple3[String, String, String]): js.Promise[Boolean] = js.native
  def submitWork(
    data: js.Tuple3[String, String, String],
    callback: js.Function2[/* error */ js.Error, /* result */ Boolean, Unit]
  ): js.Promise[Boolean] = js.native
  
  @JSName("subscribe")
  def subscribe_logs(`type`: logs, options: LogsOptions): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_logs(
    `type`: logs,
    options: LogsOptions,
    callback: js.Function2[/* error */ js.Error, /* log */ Log, Unit]
  ): Subscription[Log] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(`type`: newBlockHeaders): Subscription[BlockHeader] = js.native
  @JSName("subscribe")
  def subscribe_newBlockHeaders(
    `type`: newBlockHeaders,
    callback: js.Function2[/* error */ js.Error, /* blockHeader */ BlockHeader, Unit]
  ): Subscription[BlockHeader] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(`type`: pendingTransactions): Subscription[String] = js.native
  @JSName("subscribe")
  def subscribe_pendingTransactions(
    `type`: pendingTransactions,
    callback: js.Function2[/* error */ js.Error, /* transactionHash */ String, Unit]
  ): Subscription[String] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing): Subscription[Syncing] = js.native
  @JSName("subscribe")
  def subscribe_syncing(`type`: syncing, callback: js.Function2[/* error */ js.Error, /* result */ Syncing, Unit]): Subscription[Syncing] = js.native
  
  var transactionBlockTimeout: Double = js.native
  
  var transactionConfirmationBlocks: Double = js.native
  
  var transactionPollingTimeout: Double = js.native
}
/* static members */
@JSImport("web3-eth", "Eth")
@js.native
object Eth extends js.Object {
  
  val givenProvider: js.Any = js.native
  
  val providers: Providers = js.native
}
