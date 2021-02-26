package typingsSlinky.ssri

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.node.Buffer
import typingsSlinky.node.NodeJS.TypedArray
import typingsSlinky.node.streamMod.Readable
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.ssri.anon.Algorithms
import typingsSlinky.ssri.anon.Error
import typingsSlinky.ssri.anon.Options
import typingsSlinky.ssri.anon.OptionsPickAlgorithm
import typingsSlinky.ssri.anon.OptionsSingle
import typingsSlinky.ssri.anon.OptionsSingleStrict
import typingsSlinky.ssri.anon.PickAlgorithm
import typingsSlinky.ssri.anon.Promise
import typingsSlinky.ssri.anon.Sep
import typingsSlinky.ssri.anon.Single
import typingsSlinky.ssri.anon.SingleStrict
import typingsSlinky.ssri.anon.Size
import typingsSlinky.ssri.anon.Strict
import typingsSlinky.ssri.anon.`0`
import typingsSlinky.ssri.anon.`1`
import typingsSlinky.ssri.ssriBooleans.`false`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("ssri", "Hash")
  @js.native
  class Hash protected () extends HashLike {
    def this(hash: String) = this()
    def this(hash: String, opts: Strict) = this()
    
    def hexDigest(): String = js.native
    
    var isHash: Boolean = js.native
    
    var source: String = js.native
    
    def toJSON(): String = js.native
    
    def toString(opts: Strict): String = js.native
  }
  
  @JSImport("ssri", "Integrity")
  @js.native
  class Integrity () extends StObject {
    
    def concat(integrity: String): IntegrityMap = js.native
    def concat(integrity: String, opts: Strict): IntegrityMap = js.native
    def concat(integrity: HashLike): IntegrityMap = js.native
    def concat(integrity: HashLike, opts: Strict): IntegrityMap = js.native
    def concat(integrity: IntegrityLike): IntegrityMap = js.native
    def concat(integrity: IntegrityLike, opts: Strict): IntegrityMap = js.native
    
    def hexDigest(): String = js.native
    
    var isIntegrity: Boolean = js.native
    
    def `match`(integrity: String): Hash | `false` = js.native
    def `match`(integrity: String, opts: PickAlgorithm): Hash | `false` = js.native
    def `match`(integrity: HashLike): Hash | `false` = js.native
    def `match`(integrity: HashLike, opts: PickAlgorithm): Hash | `false` = js.native
    def `match`(integrity: IntegrityLike): Hash | `false` = js.native
    def `match`(integrity: IntegrityLike, opts: PickAlgorithm): Hash | `false` = js.native
    
    /**
      * Safely merges another IntegrityLike or integrity string into an Integrity object.
      */
    def merge(): Unit = js.native
    def merge(otherIntegrity: js.UndefOr[scala.Nothing], opts: Single): Unit = js.native
    def merge(otherIntegrity: String): Unit = js.native
    def merge(otherIntegrity: String, opts: Single): Unit = js.native
    def merge(otherIntegrity: HashLike): Unit = js.native
    def merge(otherIntegrity: HashLike, opts: Single): Unit = js.native
    def merge(otherIntegrity: IntegrityLike): Unit = js.native
    def merge(otherIntegrity: IntegrityLike, opts: Single): Unit = js.native
    
    def pickAlgorithm(): String = js.native
    def pickAlgorithm(opts: `0`): String = js.native
    
    def toJSON(): String = js.native
    
    def toString(opts: Sep): String = js.native
  }
  
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: String, sri: String): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: String, sri: String, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: String, sri: HashLike): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: String, sri: HashLike, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: String, sri: IntegrityLike): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: String, sri: IntegrityLike, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: Buffer, sri: String): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: Buffer, sri: String, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: Buffer, sri: HashLike): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: Buffer, sri: HashLike, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: Buffer, sri: IntegrityLike): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: Buffer, sri: IntegrityLike, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: TypedArray, sri: String): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: TypedArray, sri: String, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: TypedArray, sri: HashLike): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: TypedArray, sri: HashLike, opts: Error): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: TypedArray, sri: IntegrityLike): Hash | `false` = js.native
  @JSImport("ssri", "checkData")
  @js.native
  def checkData(data: TypedArray, sri: IntegrityLike, opts: Error): Hash | `false` = js.native
  
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: String): js.Thenable[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: String, opts: OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: String, opts: Size): js.Promise[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: HashLike): js.Thenable[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: HashLike, opts: OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: HashLike, opts: Size): js.Promise[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: IntegrityLike): js.Thenable[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: IntegrityLike, opts: OptionsPickAlgorithm): js.Thenable[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream(stream: Readable, sri: IntegrityLike, opts: Size): js.Promise[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream_Promise(stream: Readable, sri: String): js.Promise[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream_Promise(stream: Readable, sri: HashLike): js.Promise[Hash] = js.native
  @JSImport("ssri", "checkStream")
  @js.native
  def checkStream_Promise(stream: Readable, sri: IntegrityLike): js.Promise[Hash] = js.native
  
  @JSImport("ssri", "create")
  @js.native
  def create(): typingsSlinky.node.cryptoMod.Hash = js.native
  @JSImport("ssri", "create")
  @js.native
  def create(opts: Algorithms): typingsSlinky.node.cryptoMod.Hash = js.native
  
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: String): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: String, opts: Algorithms): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: js.typedarray.DataView): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: js.typedarray.DataView, opts: Algorithms): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: Buffer): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: Buffer, opts: Algorithms): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: TypedArray): IntegrityMap = js.native
  @JSImport("ssri", "fromData")
  @js.native
  def fromData(data: TypedArray, opts: Algorithms): IntegrityMap = js.native
  
  @JSImport("ssri", "fromHex")
  @js.native
  def fromHex(hexDigest: String, algorithm: String): Hash = js.native
  @JSImport("ssri", "fromHex")
  @js.native
  def fromHex(hexDigest: String, algorithm: String, opts: Options): IntegrityMap = js.native
  @JSImport("ssri", "fromHex")
  @js.native
  def fromHex(hexDigest: String, algorithm: String, opts: OptionsSingle): Hash = js.native
  @JSImport("ssri", "fromHex")
  @js.native
  def fromHex(hexDigest: String, algorithm: String, opts: OptionsSingleStrict): IntegrityMap | Hash = js.native
  @JSImport("ssri", "fromHex")
  @js.native
  def fromHex_IntegrityMap(hexDigest: String, algorithm: String): IntegrityMap = js.native
  @JSImport("ssri", "fromHex")
  @js.native
  def fromHex_Union(hexDigest: String, algorithm: String): IntegrityMap | Hash = js.native
  
  @JSImport("ssri", "fromStream")
  @js.native
  def fromStream(stream: Readable): js.Thenable[IntegrityMap] = js.native
  @JSImport("ssri", "fromStream")
  @js.native
  def fromStream(stream: Readable, opts: Algorithms): js.Promise[IntegrityMap] = js.native
  @JSImport("ssri", "fromStream")
  @js.native
  def fromStream(stream: Readable, opts: Promise): js.Thenable[IntegrityMap] = js.native
  @JSImport("ssri", "fromStream")
  @js.native
  def fromStream_Promise(stream: Readable): js.Promise[IntegrityMap] = js.native
  
  @JSImport("ssri", "integrityStream")
  @js.native
  def integrityStream(): Transform = js.native
  @JSImport("ssri", "integrityStream")
  @js.native
  def integrityStream(opts: typingsSlinky.ssri.anon.Integrity): Transform = js.native
  
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: String): Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: String, opts: Single): IntegrityMap | Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: String, opts: SingleStrict): IntegrityMap = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: String, opts: `1`): Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: HashLike): Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: HashLike, opts: Single): IntegrityMap | Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: HashLike, opts: SingleStrict): IntegrityMap = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: HashLike, opts: `1`): Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: IntegrityLike): Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: IntegrityLike, opts: Single): IntegrityMap | Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: IntegrityLike, opts: SingleStrict): IntegrityMap = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse(sri: IntegrityLike, opts: `1`): Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse_IntegrityMap(sri: String): IntegrityMap = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse_IntegrityMap(sri: HashLike): IntegrityMap = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse_IntegrityMap(sri: IntegrityLike): IntegrityMap = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse_Union(sri: String): IntegrityMap | Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse_Union(sri: HashLike): IntegrityMap | Hash = js.native
  @JSImport("ssri", "parse")
  @js.native
  def parse_Union(sri: IntegrityLike): IntegrityMap | Hash = js.native
  
  @JSImport("ssri", "stringify")
  @js.native
  def stringify(obj: String): String = js.native
  @JSImport("ssri", "stringify")
  @js.native
  def stringify(obj: String, opts: Sep): String = js.native
  @JSImport("ssri", "stringify")
  @js.native
  def stringify(obj: HashLike): String = js.native
  @JSImport("ssri", "stringify")
  @js.native
  def stringify(obj: HashLike, opts: Sep): String = js.native
  @JSImport("ssri", "stringify")
  @js.native
  def stringify(obj: IntegrityLike): String = js.native
  @JSImport("ssri", "stringify")
  @js.native
  def stringify(obj: IntegrityLike, opts: Sep): String = js.native
  
  @js.native
  trait HashLike extends StObject {
    
    var algorithm: String = js.native
    
    var digest: String = js.native
    
    var options: js.UndefOr[js.Array[String]] = js.native
  }
  object HashLike {
    
    @scala.inline
    def apply(algorithm: String, digest: String): HashLike = {
      val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], digest = digest.asInstanceOf[js.Any])
      __obj.asInstanceOf[HashLike]
    }
    
    @scala.inline
    implicit class HashLikeMutableBuilder[Self <: HashLike] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlgorithm(value: String): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDigest(value: String): Self = StObject.set(x, "digest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value :_*))
    }
  }
  
  type IntegrityLike = StringDictionary[js.Array[HashLike]]
  
  type IntegrityMap = Integrity with IntegrityLike
}
