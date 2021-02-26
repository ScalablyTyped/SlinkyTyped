package typingsSlinky.tensorflowTfjsLayers

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.std.Set
import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.distTypesMod.Kwargs
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object executorMod {
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "FeedDict")
  @js.native
  /**
    * Constructor, optionally does copy-construction.
    * @param feeds An Array of `Feed`s, or another `FeedDict`, in which case
    *   copy-construction will be performed.
    */
  class FeedDict () extends StObject {
    def this(feeds: js.Array[Feed]) = this()
    def this(feeds: FeedDict) = this()
    
    /**
      * Add a key-value pair to the FeedDict.
      *
      * @param key The key of the feed.
      * @param value The value of the tensor feed.
      * @param mask The value of the mask feed (optional).
      * @returns This `FeedDict`.
      * @throws ValueError: If the key `SymbolicTensor` already exists in the
      *   `FeedDict`.
      */
    def add(key: SymbolicTensor, value: Tensor[Rank]): FeedDict = js.native
    def add(key: SymbolicTensor, value: Tensor[Rank], mask: Tensor[Rank]): FeedDict = js.native
    
    /**
      * Add a Feed to the FeedDict.
      * @param feed The new `Feed` to add.
      * @returns This `FeedDict`.
      */
    def addFeed(feed: Feed): Unit = js.native
    
    /** Dispose all mask Tensors held by this object. */
    def disposeMasks(): Unit = js.native
    
    def getMask(key: String): Tensor[Rank] = js.native
    /**
      * Get the feed mask for given key.
      * @param key The SymbolicTensor, or its name (as a string), of which the
      *     value is sought.
      * @returns If `key` exists, the corresponding feed mask.
      * @throws ValueError: If `key` does not exist in this `FeedDict`.
      */
    def getMask(key: SymbolicTensor): Tensor[Rank] = js.native
    
    def getValue(key: String): Tensor[Rank] = js.native
    /**
      * Get the feed value for given key.
      * @param key The SymbolicTensor, or its name (as a string), of which the
      *     value is sought.
      * @returns If `key` exists, the corresponding feed value.
      * @throws ValueError: If `key` does not exist in this `FeedDict`.
      */
    def getValue(key: SymbolicTensor): Tensor[Rank] = js.native
    
    /**
      * Probe whether a key already exists in the FeedDict.
      * @param key
      */
    def hasKey(key: SymbolicTensor): Boolean = js.native
    
    var id2Mask: js.Any = js.native
    
    var id2Value: js.Any = js.native
    
    var name2Id: js.Any = js.native
    
    /**
      * Get all the SymbolicTensor available in this FeedDict.
      */
    def names(): js.Array[String] = js.native
  }
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(
    fetches: js.Array[SymbolicTensor],
    feedDict: FeedDict,
    kwargs: js.UndefOr[scala.Nothing],
    probe: ExecutionProbe
  ): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(fetches: js.Array[SymbolicTensor], feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(fetches: SymbolicTensor, feedDict: FeedDict): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(
    fetches: SymbolicTensor,
    feedDict: FeedDict,
    kwargs: js.UndefOr[scala.Nothing],
    probe: ExecutionProbe
  ): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "execute")
  @js.native
  def execute(fetches: SymbolicTensor, feedDict: FeedDict, kwargs: Kwargs, probe: ExecutionProbe): Tensor[Rank] | (js.Array[js.Array[Tensor[Rank]] | Tensor[Rank]]) = js.native
  
  @JSImport("@tensorflow/tfjs-layers/dist/engine/executor", "getTopologicalSortAndRecipientCountsForOneFetch")
  @js.native
  def getTopologicalSortAndRecipientCountsForOneFetch(fetch: SymbolicTensor, feedDict: FeedDict): typingsSlinky.tensorflowTfjsLayers.anon.RecipientMap = js.native
  
  @js.native
  trait ExecutionProbe extends StObject {
    
    /**
      * Maximum number of tensors that exist during all steps of the
      * execution. Tensor counts are measured at the beginning of every
      * step.
      */
    var maxNumTensors: js.UndefOr[Double] = js.native
    
    /**
      * Minimum number of tensors that exist during all steps of the
      * execution. Tensor counts are measured at the beginning of every
      * step.
      */
    var minNumTensors: js.UndefOr[Double] = js.native
  }
  object ExecutionProbe {
    
    @scala.inline
    def apply(): ExecutionProbe = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExecutionProbe]
    }
    
    @scala.inline
    implicit class ExecutionProbeMutableBuilder[Self <: ExecutionProbe] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaxNumTensors(value: Double): Self = StObject.set(x, "maxNumTensors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxNumTensorsUndefined: Self = StObject.set(x, "maxNumTensors", js.undefined)
      
      @scala.inline
      def setMinNumTensors(value: Double): Self = StObject.set(x, "minNumTensors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinNumTensorsUndefined: Self = StObject.set(x, "minNumTensors", js.undefined)
    }
  }
  
  @js.native
  trait Feed extends StObject {
    
    var key: SymbolicTensor = js.native
    
    var value: Tensor[Rank] = js.native
  }
  object Feed {
    
    @scala.inline
    def apply(key: SymbolicTensor, value: Tensor[Rank]): Feed = {
      val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Feed]
    }
    
    @scala.inline
    implicit class FeedMutableBuilder[Self <: Feed] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: SymbolicTensor): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: Tensor[Rank]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  type RecipientMap = StringDictionary[Set[String]]
}
