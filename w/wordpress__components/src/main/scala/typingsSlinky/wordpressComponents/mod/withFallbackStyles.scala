package typingsSlinky.wordpressComponents.mod

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@wordpress/components", "withFallbackStyles")
@js.native
object withFallbackStyles extends js.Object {
  
  def apply[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[js.Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, /* keyof FSP */ String]]
  ] = js.native
}
