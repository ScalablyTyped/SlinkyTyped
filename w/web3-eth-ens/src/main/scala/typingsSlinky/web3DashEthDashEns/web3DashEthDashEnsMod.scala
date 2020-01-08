package typingsSlinky.web3DashEthDashEns

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.web3DashCore.web3DashCoreMod.PromiEvent
import typingsSlinky.web3DashCore.web3DashCoreMod.TransactionConfig
import typingsSlinky.web3DashEthDashContract.web3DashEthDashContractMod.Contract
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("web3-eth-ens", JSImport.Namespace)
@js.native
object web3DashEthDashEnsMod extends js.Object {
  @js.native
  class Ens protected () extends js.Object {
    def this(eth: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Eth */ js.Any) = this()
    var registry: Registry = js.native
    def getAddress(name: String): js.Promise[String] = js.native
    def getAddress(name: String, callback: js.Function2[/* error */ js.Error, /* address */ String, Unit]): js.Promise[String] = js.native
    def getContent(name: String): js.Promise[String] = js.native
    def getContent(name: String, callback: js.Function2[/* error */ js.Error, /* contentHash */ String, Unit]): js.Promise[String] = js.native
    def getContenthash(name: String): js.Promise[String] = js.native
    def getContenthash(name: String, callback: js.Function2[/* error */ js.Error, /* contenthash */ String, Unit]): js.Promise[String] = js.native
    def getMultihash(name: String): js.Promise[String] = js.native
    def getMultihash(name: String, callback: js.Function2[/* error */ js.Error, /* multihash */ String, Unit]): js.Promise[String] = js.native
    def getPubkey(name: String): js.Promise[StringDictionary[String]] = js.native
    def getPubkey(
      name: String,
      callback: js.Function2[/* error */ js.Error, /* result */ StringDictionary[String], Unit]
    ): js.Promise[StringDictionary[String]] = js.native
    def getText(name: String, key: String): js.Promise[String] = js.native
    def getText(
      name: String,
      key: String,
      callback: js.Function2[/* error */ js.Error, /* ensName */ String, Unit]
    ): js.Promise[String] = js.native
    def resolver(name: String): js.Promise[Contract] = js.native
    def setAddress(name: String, address: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setAddress(
      name: String,
      address: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setContent(name: String, hash: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setContent(
      name: String,
      hash: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setContenthash(name: String, hash: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setContenthash(
      name: String,
      hash: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setMultihash(name: String, hash: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setMultihash(
      name: String,
      hash: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setPubkey(name: String, x: String, y: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setPubkey(
      name: String,
      x: String,
      y: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def setText(name: String, key: String, value: String, sendOptions: TransactionConfig): PromiEvent[_] = js.native
    def setText(
      name: String,
      key: String,
      value: String,
      sendOptions: TransactionConfig,
      callback: js.Function2[/* error */ js.Error, /* result */ js.Any, Unit]
    ): PromiEvent[_] = js.native
    def supportsInterface(name: String, interfaceId: String): js.Promise[Boolean] = js.native
    def supportsInterface(
      name: String,
      interfaceId: String,
      callback: js.Function2[/* error */ js.Error, /* supportsInterface */ Boolean, Unit]
    ): js.Promise[Boolean] = js.native
  }
  
  @js.native
  class Registry protected () extends js.Object {
    def this(ens: Ens) = this()
    var contract: Contract | Null = js.native
    var ens: Ens = js.native
    def owner(name: String): js.Promise[String] = js.native
    def owner(name: String, callback: js.Function2[/* error */ js.Error, /* address */ String, Unit]): js.Promise[String] = js.native
    def resolver(name: String): js.Promise[Contract] = js.native
  }
  
}

