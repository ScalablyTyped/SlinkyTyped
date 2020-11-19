package typingsSlinky.semanticUiReact.headerHeaderMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.FunctionComponent
import typingsSlinky.semanticUiReact.headerContentMod.HeaderContentProps
import typingsSlinky.semanticUiReact.headerSubheaderMod.HeaderSubheaderProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HeaderComponent extends FunctionComponent[HeaderProps] {
  
  var Content: ReactComponentClass[HeaderContentProps] = js.native
  
  var Subheader: ReactComponentClass[HeaderSubheaderProps] = js.native
}
