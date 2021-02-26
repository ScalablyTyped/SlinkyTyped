package typingsSlinky.webicon

import typingsSlinky.webicon.imageIconOptionsMod.ImageIconOptions
import typingsSlinky.webicon.sizeableOptionsMod.SizeableOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object svgIconOptionsMod {
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typingsSlinky.webicon.sizeableMod.Sizeable because Already inherited
  - typingsSlinky.webicon.iconMod.Icon because Already inherited
  - typingsSlinky.webicon.svgIconMod.SvgIcon because var conflicts: iconIdParser, iconSize. Inlined viewBox */ @js.native
  trait SvgIconOptions
    extends ImageIconOptions
       with SizeableOptions {
    
    /**
      * The default viewBox of the icon.
      */
    var viewBox: js.UndefOr[String] = js.native
  }
  object SvgIconOptions {
    
    @scala.inline
    def apply(): SvgIconOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SvgIconOptions]
    }
    
    @scala.inline
    implicit class SvgIconOptionsMutableBuilder[Self <: SvgIconOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setViewBox(value: String): Self = StObject.set(x, "viewBox", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewBoxUndefined: Self = StObject.set(x, "viewBox", js.undefined)
    }
  }
}
