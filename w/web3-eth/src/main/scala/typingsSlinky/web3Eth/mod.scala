package typingsSlinky.web3Eth

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
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("web3-eth", "Eth")
  @js.native
  class Eth () extends StObject {
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
    
    def getProof(address: String, storageKey: js.Array[BigNumber | Double | String | ^], blockNumber: BlockNumber): js.Promise[GetProof] = js.native
    def getProof(
      address: String,
      storageKey: js.Array[BigNumber | Double | String | ^],
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
  object Eth {
    
    @JSImport("web3-eth", "Eth.givenProvider")
    @js.native
    val givenProvider: js.Any = js.native
    
    @JSImport("web3-eth", "Eth.providers")
    @js.native
    val providers: Providers = js.native
  }
  
  @js.native
  trait Block extends BlockTransactionBase {
    
    var transactions: js.Array[String | Transaction] = js.native
  }
  object Block {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      transactions: js.Array[String | Transaction],
      uncles: js.Array[String]
    ): Block = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[Block]
    }
    
    @scala.inline
    implicit class BlockMutableBuilder[Self <: Block] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactions(value: js.Array[String | Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: (String | Transaction)*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BlockHeader extends StObject {
    
    var extraData: String = js.native
    
    var gasLimit: Double = js.native
    
    var gasUsed: Double = js.native
    
    var hash: String = js.native
    
    var logsBloom: String = js.native
    
    var miner: String = js.native
    
    var nonce: String = js.native
    
    var number: Double = js.native
    
    var parentHash: String = js.native
    
    var receiptRoot: String = js.native
    
    var sha3Uncles: String = js.native
    
    var stateRoot: String = js.native
    
    var timestamp: Double | String = js.native
    
    var transactionRoot: String = js.native
  }
  object BlockHeader {
    
    @scala.inline
    def apply(
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      stateRoot: String,
      timestamp: Double | String,
      transactionRoot: String
    ): BlockHeader = {
      val __obj = js.Dynamic.literal(extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockHeader]
    }
    
    @scala.inline
    implicit class BlockHeaderMutableBuilder[Self <: BlockHeader] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtraData(value: String): Self = StObject.set(x, "extraData", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasLimit(value: Double): Self = StObject.set(x, "gasLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGasUsed(value: Double): Self = StObject.set(x, "gasUsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHash(value: String): Self = StObject.set(x, "hash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLogsBloom(value: String): Self = StObject.set(x, "logsBloom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiner(value: String): Self = StObject.set(x, "miner", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: Double): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParentHash(value: String): Self = StObject.set(x, "parentHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReceiptRoot(value: String): Self = StObject.set(x, "receiptRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSha3Uncles(value: String): Self = StObject.set(x, "sha3Uncles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateRoot(value: String): Self = StObject.set(x, "stateRoot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimestamp(value: Double | String): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionRoot(value: String): Self = StObject.set(x, "transactionRoot", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait BlockTransactionBase extends BlockHeader {
    
    var difficulty: Double = js.native
    
    var size: Double = js.native
    
    var totalDifficulty: Double = js.native
    
    var uncles: js.Array[String] = js.native
  }
  object BlockTransactionBase {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      uncles: js.Array[String]
    ): BlockTransactionBase = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTransactionBase]
    }
    
    @scala.inline
    implicit class BlockTransactionBaseMutableBuilder[Self <: BlockTransactionBase] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDifficulty(value: Double): Self = StObject.set(x, "difficulty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalDifficulty(value: Double): Self = StObject.set(x, "totalDifficulty", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUncles(value: js.Array[String]): Self = StObject.set(x, "uncles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnclesVarargs(value: String*): Self = StObject.set(x, "uncles", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BlockTransactionObject extends BlockTransactionBase {
    
    var transactions: js.Array[Transaction] = js.native
  }
  object BlockTransactionObject {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      transactions: js.Array[Transaction],
      uncles: js.Array[String]
    ): BlockTransactionObject = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTransactionObject]
    }
    
    @scala.inline
    implicit class BlockTransactionObjectMutableBuilder[Self <: BlockTransactionObject] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactions(value: js.Array[Transaction]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: Transaction*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait BlockTransactionString extends BlockTransactionBase {
    
    var transactions: js.Array[String] = js.native
  }
  object BlockTransactionString {
    
    @scala.inline
    def apply(
      difficulty: Double,
      extraData: String,
      gasLimit: Double,
      gasUsed: Double,
      hash: String,
      logsBloom: String,
      miner: String,
      nonce: String,
      number: Double,
      parentHash: String,
      receiptRoot: String,
      sha3Uncles: String,
      size: Double,
      stateRoot: String,
      timestamp: Double | String,
      totalDifficulty: Double,
      transactionRoot: String,
      transactions: js.Array[String],
      uncles: js.Array[String]
    ): BlockTransactionString = {
      val __obj = js.Dynamic.literal(difficulty = difficulty.asInstanceOf[js.Any], extraData = extraData.asInstanceOf[js.Any], gasLimit = gasLimit.asInstanceOf[js.Any], gasUsed = gasUsed.asInstanceOf[js.Any], hash = hash.asInstanceOf[js.Any], logsBloom = logsBloom.asInstanceOf[js.Any], miner = miner.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], parentHash = parentHash.asInstanceOf[js.Any], receiptRoot = receiptRoot.asInstanceOf[js.Any], sha3Uncles = sha3Uncles.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stateRoot = stateRoot.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any], totalDifficulty = totalDifficulty.asInstanceOf[js.Any], transactionRoot = transactionRoot.asInstanceOf[js.Any], transactions = transactions.asInstanceOf[js.Any], uncles = uncles.asInstanceOf[js.Any])
      __obj.asInstanceOf[BlockTransactionString]
    }
    
    @scala.inline
    implicit class BlockTransactionStringMutableBuilder[Self <: BlockTransactionString] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTransactions(value: js.Array[String]): Self = StObject.set(x, "transactions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransactionsVarargs(value: String*): Self = StObject.set(x, "transactions", js.Array(value :_*))
    }
  }
  
  @js.native
  trait GetProof extends StObject {
    
    var accountProof: js.Array[String] = js.native
    
    var address: String = js.native
    
    var balance: String = js.native
    
    var codeHash: String = js.native
    
    var nonce: String = js.native
    
    var storageHash: String = js.native
    
    var storageProof: js.Array[StorageProof] = js.native
  }
  object GetProof {
    
    @scala.inline
    def apply(
      accountProof: js.Array[String],
      address: String,
      balance: String,
      codeHash: String,
      nonce: String,
      storageHash: String,
      storageProof: js.Array[StorageProof]
    ): GetProof = {
      val __obj = js.Dynamic.literal(accountProof = accountProof.asInstanceOf[js.Any], address = address.asInstanceOf[js.Any], balance = balance.asInstanceOf[js.Any], codeHash = codeHash.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any], storageHash = storageHash.asInstanceOf[js.Any], storageProof = storageProof.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetProof]
    }
    
    @scala.inline
    implicit class GetProofMutableBuilder[Self <: GetProof] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAccountProof(value: js.Array[String]): Self = StObject.set(x, "accountProof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccountProofVarargs(value: String*): Self = StObject.set(x, "accountProof", js.Array(value :_*))
      
      @scala.inline
      def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBalance(value: String): Self = StObject.set(x, "balance", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCodeHash(value: String): Self = StObject.set(x, "codeHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageHash(value: String): Self = StObject.set(x, "storageHash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageProof(value: js.Array[StorageProof]): Self = StObject.set(x, "storageProof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStorageProofVarargs(value: StorageProof*): Self = StObject.set(x, "storageProof", js.Array(value :_*))
    }
  }
  
  @js.native
  trait StorageProof extends StObject {
    
    var key: String = js.native
    
    var proof: js.Array[String] = js.native
    
    var value: String = js.native
  }
  object StorageProof {
    
    @scala.inline
    def apply(key: String, proof: js.Array[String], value: String): StorageProof = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], proof = proof.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[StorageProof]
    }
    
    @scala.inline
    implicit class StorageProofMutableBuilder[Self <: StorageProof] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProof(value: js.Array[String]): Self = StObject.set(x, "proof", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProofVarargs(value: String*): Self = StObject.set(x, "proof", js.Array(value :_*))
      
      @scala.inline
      def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Syncing extends StObject {
    
    var CurrentBlock: Double = js.native
    
    var HighestBlock: Double = js.native
    
    var KnownStates: Double = js.native
    
    var PulledStates: Double = js.native
    
    var StartingBlock: Double = js.native
  }
  object Syncing {
    
    @scala.inline
    def apply(
      CurrentBlock: Double,
      HighestBlock: Double,
      KnownStates: Double,
      PulledStates: Double,
      StartingBlock: Double
    ): Syncing = {
      val __obj = js.Dynamic.literal(CurrentBlock = CurrentBlock.asInstanceOf[js.Any], HighestBlock = HighestBlock.asInstanceOf[js.Any], KnownStates = KnownStates.asInstanceOf[js.Any], PulledStates = PulledStates.asInstanceOf[js.Any], StartingBlock = StartingBlock.asInstanceOf[js.Any])
      __obj.asInstanceOf[Syncing]
    }
    
    @scala.inline
    implicit class SyncingMutableBuilder[Self <: Syncing] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCurrentBlock(value: Double): Self = StObject.set(x, "CurrentBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHighestBlock(value: Double): Self = StObject.set(x, "HighestBlock", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKnownStates(value: Double): Self = StObject.set(x, "KnownStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPulledStates(value: Double): Self = StObject.set(x, "PulledStates", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartingBlock(value: Double): Self = StObject.set(x, "StartingBlock", value.asInstanceOf[js.Any])
    }
  }
}
