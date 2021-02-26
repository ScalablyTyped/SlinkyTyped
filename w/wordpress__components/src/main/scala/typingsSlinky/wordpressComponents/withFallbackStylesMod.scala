package typingsSlinky.wordpressComponents

import org.scalablytyped.runtime.StringDictionary
import org.scalajs.dom.raw.HTMLDivElement
import slinky.core.ReactComponentClass
import typingsSlinky.std.Omit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withFallbackStylesMod {
  
  @JSImport("@wordpress/components/higher-order/with-fallback-styles", JSImport.Default)
  @js.native
  def default[FSP](
    mapNodeToProps: js.Function2[/* parentNode */ HTMLDivElement, /* ownProps */ StringDictionary[js.Any], FSP]
  ): js.Function1[
    /* wrappedComponent */ ReactComponentClass[_], 
    ReactComponentClass[Omit[_, /* keyof FSP */ String]]
  ] = js.native
}
