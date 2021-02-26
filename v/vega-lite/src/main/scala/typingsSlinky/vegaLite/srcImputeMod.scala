package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.transformMod.ImputeSequence
import typingsSlinky.vegaTypings.transformMod.ImputeMethod
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcImputeMod {
  
  @js.native
  trait ImputeParams extends StObject {
    
    /**
      * A frame specification as a two-element array used to control the window over which the specified method is applied. The array entries should either be a number indicating the offset from the current data object, or null to indicate unbounded rows preceding or following the current data object. For example, the value `[-5, 5]` indicates that the window should include five objects preceding and five objects following the current object.
      *
      * __Default value:__:  `[null, null]` indicating that the window includes all objects.
      */
    var frame: js.UndefOr[js.Tuple2[Null | Double, Null | Double]] = js.native
    
    /**
      * Defines the key values that should be considered for imputation.
      * An array of key values or an object defining a [number sequence](https://vega.github.io/vega-lite/docs/impute.html#sequence-def).
      *
      * If provided, this will be used in addition to the key values observed within the input data. If not provided, the values will be derived from all unique values of the `key` field. For `impute` in `encoding`, the key field is the x-field if the y-field is imputed, or vice versa.
      *
      * If there is no impute grouping, this property _must_ be specified.
      */
    var keyvals: js.UndefOr[js.Array[_] | ImputeSequence] = js.native
    
    /**
      * The imputation method to use for the field value of imputed data objects.
      * One of `"value"`, `"mean"`, `"median"`, `"max"` or `"min"`.
      *
      * __Default value:__  `"value"`
      */
    var method: js.UndefOr[ImputeMethod] = js.native
    
    /**
      * The field value to use when the imputation `method` is `"value"`.
      */
    var value: js.UndefOr[js.Any] = js.native
  }
  object ImputeParams {
    
    @scala.inline
    def apply(): ImputeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ImputeParams]
    }
    
    @scala.inline
    implicit class ImputeParamsMutableBuilder[Self <: ImputeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrame(value: js.Tuple2[Null | Double, Null | Double]): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameUndefined: Self = StObject.set(x, "frame", js.undefined)
      
      @scala.inline
      def setKeyvals(value: js.Array[_] | ImputeSequence): Self = StObject.set(x, "keyvals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyvalsUndefined: Self = StObject.set(x, "keyvals", js.undefined)
      
      @scala.inline
      def setKeyvalsVarargs(value: js.Any*): Self = StObject.set(x, "keyvals", js.Array(value :_*))
      
      @scala.inline
      def setMethod(value: ImputeMethod): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    }
  }
}
