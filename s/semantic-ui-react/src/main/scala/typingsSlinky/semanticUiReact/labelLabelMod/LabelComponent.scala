package typingsSlinky.semanticUiReact.labelLabelMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.labelDetailMod.LabelDetailProps
import typingsSlinky.semanticUiReact.labelGroupMod.LabelGroupProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LabelComponent
  extends ComponentClass[LabelProps, js.Object] {
  
  var Detail: ReactComponentClass[LabelDetailProps] = js.native
  
  var Group: ReactComponentClass[LabelGroupProps] = js.native
}
