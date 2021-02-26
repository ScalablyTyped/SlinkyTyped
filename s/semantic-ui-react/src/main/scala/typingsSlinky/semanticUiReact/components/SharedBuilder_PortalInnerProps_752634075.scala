package typingsSlinky.semanticUiReact.components

import slinky.core.facade.ReactRef
import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.portalInnerMod.PortalInnerProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_PortalInnerProps_752634075[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def innerRef(value: typingsSlinky.react.mod.Ref[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def innerRefFunction1(value: /* instance */ _ | Null => Unit): this.type = set("innerRef", js.Any.fromFunction1(value))
  
  @scala.inline
  def innerRefNull: this.type = set("innerRef", null)
  
  @scala.inline
  def innerRefRefObject(value: ReactRef[_]): this.type = set("innerRef", value.asInstanceOf[js.Any])
  
  @scala.inline
  def mountNode(value: js.Any): this.type = set("mountNode", value.asInstanceOf[js.Any])
  
  @scala.inline
  def onMount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): this.type = set("onMount", js.Any.fromFunction2(value))
  
  @scala.inline
  def onUnmount(value: (/* nothing */ Null, /* data */ PortalInnerProps) => Unit): this.type = set("onUnmount", js.Any.fromFunction2(value))
}
