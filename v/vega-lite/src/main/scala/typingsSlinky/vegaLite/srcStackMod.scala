package typingsSlinky.vegaLite

import typingsSlinky.std.Set
import typingsSlinky.vegaLite.anon.ChannelFieldDef
import typingsSlinky.vegaLite.anon.DisallowNonLinearStack
import typingsSlinky.vegaLite.channeldefMod.FieldName
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcMarkMod.MarkDef
import typingsSlinky.vegaLite.vegaLiteStrings.arc
import typingsSlinky.vegaLite.vegaLiteStrings.area
import typingsSlinky.vegaLite.vegaLiteStrings.bar
import typingsSlinky.vegaLite.vegaLiteStrings.circle
import typingsSlinky.vegaLite.vegaLiteStrings.geoshape
import typingsSlinky.vegaLite.vegaLiteStrings.image
import typingsSlinky.vegaLite.vegaLiteStrings.line
import typingsSlinky.vegaLite.vegaLiteStrings.point
import typingsSlinky.vegaLite.vegaLiteStrings.radius
import typingsSlinky.vegaLite.vegaLiteStrings.rect
import typingsSlinky.vegaLite.vegaLiteStrings.rule
import typingsSlinky.vegaLite.vegaLiteStrings.square
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.theta
import typingsSlinky.vegaLite.vegaLiteStrings.tick
import typingsSlinky.vegaLite.vegaLiteStrings.trail
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcStackMod {
  
  @JSImport("vega-lite/build/src/stack", "STACKABLE_MARKS")
  @js.native
  val STACKABLE_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  @JSImport("vega-lite/build/src/stack", "STACK_BY_DEFAULT_MARKS")
  @js.native
  val STACK_BY_DEFAULT_MARKS: Set[
    square | area | circle | image | line | rect | text | point | arc | rule | trail | geoshape | bar | tick
  ] = js.native
  
  @JSImport("vega-lite/build/src/stack", "isStackOffset")
  @js.native
  def isStackOffset(s: String): /* is vega-lite.vega-lite/build/src/stack.StackOffset */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String]): StackProperties = js.native
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: MarkDef[Mark, ExprRef | SignalRef], encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = js.native
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: Mark, encoding: Encoding[String]): StackProperties = js.native
  @JSImport("vega-lite/build/src/stack", "stack")
  @js.native
  def stack(m: Mark, encoding: Encoding[String], opt: DisallowNonLinearStack): StackProperties = js.native
  
  /* keyof vega-lite.anon.Center */ /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.zero
    - typingsSlinky.vegaLite.vegaLiteStrings.center
    - typingsSlinky.vegaLite.vegaLiteStrings.normalize
  */
  trait StackOffset extends StObject
  
  @js.native
  trait StackProperties extends StObject {
    
    /** Measure axis of the stack. */
    var fieldChannel: x | y | theta | radius = js.native
    
    /** Dimension axis of the stack. */
    var groupbyChannel: js.UndefOr[x | y | theta | radius] = js.native
    
    /** Field for groupbyChannel. */
    var groupbyField: js.UndefOr[FieldName] = js.native
    
    /**
      * Whether this stack will produce impute transform
      */
    var impute: Boolean = js.native
    
    /**
      * See `stack` property of Position Field Def.
      */
    var offset: StackOffset = js.native
    
    /** Stack-by fields e.g., color, detail */
    var stackBy: js.Array[ChannelFieldDef] = js.native
  }
  object StackProperties {
    
    @scala.inline
    def apply(
      fieldChannel: x | y | theta | radius,
      impute: Boolean,
      offset: StackOffset,
      stackBy: js.Array[ChannelFieldDef]
    ): StackProperties = {
      val __obj = js.Dynamic.literal(fieldChannel = fieldChannel.asInstanceOf[js.Any], impute = impute.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], stackBy = stackBy.asInstanceOf[js.Any])
      __obj.asInstanceOf[StackProperties]
    }
    
    @scala.inline
    implicit class StackPropertiesMutableBuilder[Self <: StackProperties] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFieldChannel(value: typingsSlinky.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "fieldChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyChannel(value: typingsSlinky.vegaLite.vegaLiteStrings.x | y | theta | radius): Self = StObject.set(x, "groupbyChannel", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyChannelUndefined: Self = StObject.set(x, "groupbyChannel", js.undefined)
      
      @scala.inline
      def setGroupbyField(value: FieldName): Self = StObject.set(x, "groupbyField", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGroupbyFieldUndefined: Self = StObject.set(x, "groupbyField", js.undefined)
      
      @scala.inline
      def setImpute(value: Boolean): Self = StObject.set(x, "impute", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: StackOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackBy(value: js.Array[ChannelFieldDef]): Self = StObject.set(x, "stackBy", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStackByVarargs(value: ChannelFieldDef*): Self = StObject.set(x, "stackBy", js.Array(value :_*))
    }
  }
}
