package typingsSlinky.wixUiIconsCommon

import org.scalablytyped.runtime.Shortcut
import org.scalajs.dom.raw.SVGElement
import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.SVGAttributes
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gitHubSmallMod extends Shortcut {
  
  @JSImport("wix-ui-icons-common/dist/src/general/dist/components/GitHubSmall", JSImport.Default)
  @js.native
  val default: ReactComponentClass[GitHubSmallProps] = js.native
  
  @js.native
  trait GitHubSmallProps extends SVGAttributes[SVGElement] {
    
    var size: js.UndefOr[String] = js.native
  }
  object GitHubSmallProps {
    
    @scala.inline
    def apply(): GitHubSmallProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GitHubSmallProps]
    }
    
    @scala.inline
    implicit class GitHubSmallPropsMutableBuilder[Self <: GitHubSmallProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  type _To = ReactComponentClass[GitHubSmallProps]
  
  /* This means you don't have to write `default`, but can instead just say `gitHubSmallMod.foo` */
  override def _to: ReactComponentClass[GitHubSmallProps] = default
}
