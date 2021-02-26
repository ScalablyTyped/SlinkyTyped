package typingsSlinky.tensorflowTfjsLayers

import typingsSlinky.tensorflowTfjsCore.distTensorMod.Tensor
import typingsSlinky.tensorflowTfjsCore.distTypesMod.Rank
import typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.History
import typingsSlinky.tensorflowTfjsLayers.topologyMod.SymbolicTensor
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait CallbackList extends StObject {
    
    var callbackList: typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList = js.native
    
    var history: History = js.native
  }
  object CallbackList {
    
    @scala.inline
    def apply(callbackList: typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList, history: History): CallbackList = {
      val __obj = js.Dynamic.literal(callbackList = callbackList.asInstanceOf[js.Any], history = history.asInstanceOf[js.Any])
      __obj.asInstanceOf[CallbackList]
    }
    
    @scala.inline
    implicit class CallbackListMutableBuilder[Self <: CallbackList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCallbackList(value: typingsSlinky.tensorflowTfjsLayers.baseCallbacksMod.CallbackList): Self = StObject.set(x, "callbackList", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHistory(value: History): Self = StObject.set(x, "history", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Constants extends StObject {
    
    var constants: js.Array[SymbolicTensor | Tensor[Rank]] = js.native
    
    var initialState: js.Array[SymbolicTensor | Tensor[Rank]] = js.native
    
    var inputs: Tensor[Rank] | SymbolicTensor = js.native
  }
  object Constants {
    
    @scala.inline
    def apply(
      constants: js.Array[SymbolicTensor | Tensor[Rank]],
      initialState: js.Array[SymbolicTensor | Tensor[Rank]],
      inputs: Tensor[Rank] | SymbolicTensor
    ): Constants = {
      val __obj = js.Dynamic.literal(constants = constants.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any])
      __obj.asInstanceOf[Constants]
    }
    
    @scala.inline
    implicit class ConstantsMutableBuilder[Self <: Constants] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConstants(value: js.Array[SymbolicTensor | Tensor[Rank]]): Self = StObject.set(x, "constants", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConstantsVarargs(value: (SymbolicTensor | Tensor[Rank])*): Self = StObject.set(x, "constants", js.Array(value :_*))
      
      @scala.inline
      def setInitialState(value: js.Array[SymbolicTensor | Tensor[Rank]]): Self = StObject.set(x, "initialState", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialStateVarargs(value: (SymbolicTensor | Tensor[Rank])*): Self = StObject.set(x, "initialState", js.Array(value :_*))
      
      @scala.inline
      def setInputs(value: Tensor[Rank] | SymbolicTensor): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Count extends StObject {
    
    var count: js.UndefOr[Double] = js.native
    
    def ones(): Tensor[Rank] = js.native
    
    var rate: Double = js.native
    
    var training: js.UndefOr[Boolean] = js.native
  }
  object Count {
    
    @scala.inline
    def apply(ones: () => Tensor[Rank], rate: Double): Count = {
      val __obj = js.Dynamic.literal(ones = js.Any.fromFunction0(ones), rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Count]
    }
    
    @scala.inline
    implicit class CountMutableBuilder[Self <: Count] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
      
      @scala.inline
      def setOnes(value: () => Tensor[Rank]): Self = StObject.set(x, "ones", js.Any.fromFunction0(value))
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTraining(value: Boolean): Self = StObject.set(x, "training", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTrainingUndefined: Self = StObject.set(x, "training", js.undefined)
    }
  }
  
  @js.native
  trait MaskValue extends StObject {
    
    var maskValue: Double = js.native
  }
  object MaskValue {
    
    @scala.inline
    def apply(maskValue: Double): MaskValue = {
      val __obj = js.Dynamic.literal(maskValue = maskValue.asInstanceOf[js.Any])
      __obj.asInstanceOf[MaskValue]
    }
    
    @scala.inline
    implicit class MaskValueMutableBuilder[Self <: MaskValue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMaskValue(value: Double): Self = StObject.set(x, "maskValue", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Rate extends StObject {
    
    var rate: Double = js.native
  }
  object Rate {
    
    @scala.inline
    def apply(rate: Double): Rate = {
      val __obj = js.Dynamic.literal(rate = rate.asInstanceOf[js.Any])
      __obj.asInstanceOf[Rate]
    }
    
    @scala.inline
    implicit class RateMutableBuilder[Self <: Rate] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRate(value: Double): Self = StObject.set(x, "rate", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait RecipientMap extends StObject {
    
    var recipientMap: typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap = js.native
    
    var sorted: js.Array[SymbolicTensor] = js.native
  }
  object RecipientMap {
    
    @scala.inline
    def apply(
      recipientMap: typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap,
      sorted: js.Array[SymbolicTensor]
    ): RecipientMap = {
      val __obj = js.Dynamic.literal(recipientMap = recipientMap.asInstanceOf[js.Any], sorted = sorted.asInstanceOf[js.Any])
      __obj.asInstanceOf[RecipientMap]
    }
    
    @scala.inline
    implicit class RecipientMapMutableBuilder[Self <: RecipientMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecipientMap(value: typingsSlinky.tensorflowTfjsLayers.executorMod.RecipientMap): Self = StObject.set(x, "recipientMap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSorted(value: js.Array[SymbolicTensor]): Self = StObject.set(x, "sorted", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSortedVarargs(value: SymbolicTensor*): Self = StObject.set(x, "sorted", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Stddev extends StObject {
    
    var stddev: Double = js.native
  }
  object Stddev {
    
    @scala.inline
    def apply(stddev: Double): Stddev = {
      val __obj = js.Dynamic.literal(stddev = stddev.asInstanceOf[js.Any])
      __obj.asInstanceOf[Stddev]
    }
    
    @scala.inline
    implicit class StddevMutableBuilder[Self <: Stddev] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStddev(value: Double): Self = StObject.set(x, "stddev", value.asInstanceOf[js.Any])
    }
  }
}
