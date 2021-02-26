package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.arc
import typingsSlinky.vegaLite.vegaLiteStrings.area
import typingsSlinky.vegaLite.vegaLiteStrings.group
import typingsSlinky.vegaLite.vegaLiteStrings.image
import typingsSlinky.vegaLite.vegaLiteStrings.line
import typingsSlinky.vegaLite.vegaLiteStrings.path
import typingsSlinky.vegaLite.vegaLiteStrings.rect
import typingsSlinky.vegaLite.vegaLiteStrings.rule
import typingsSlinky.vegaLite.vegaLiteStrings.shape
import typingsSlinky.vegaLite.vegaLiteStrings.symbol
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.trail
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaLite.vegaSchemaMod.VgPostEncodingTransform
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object baseMod {
  
  @js.native
  trait MarkCompiler extends StObject {
    
    def encodeEntry(model: UnitModel): VgEncodeEntry = js.native
    
    /**
      * Transform on a mark after render, used for layout and projections
      */
    var postEncodingTransform: js.UndefOr[js.Function1[/* model */ UnitModel, js.Array[VgPostEncodingTransform]]] = js.native
    
    /**
      * Underlying Vega Mark type for the Vega-Lite mark.
      */
    var vgMark: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail = js.native
  }
  object MarkCompiler {
    
    @scala.inline
    def apply(
      encodeEntry: UnitModel => VgEncodeEntry,
      vgMark: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail
    ): MarkCompiler = {
      val __obj = js.Dynamic.literal(encodeEntry = js.Any.fromFunction1(encodeEntry), vgMark = vgMark.asInstanceOf[js.Any])
      __obj.asInstanceOf[MarkCompiler]
    }
    
    @scala.inline
    implicit class MarkCompilerMutableBuilder[Self <: MarkCompiler] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncodeEntry(value: UnitModel => VgEncodeEntry): Self = StObject.set(x, "encodeEntry", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostEncodingTransform(value: /* model */ UnitModel => js.Array[VgPostEncodingTransform]): Self = StObject.set(x, "postEncodingTransform", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPostEncodingTransformUndefined: Self = StObject.set(x, "postEncodingTransform", js.undefined)
      
      @scala.inline
      def setVgMark(value: arc | area | image | group | line | path | rect | rule | shape | symbol | text | trail): Self = StObject.set(x, "vgMark", value.asInstanceOf[js.Any])
    }
  }
}
