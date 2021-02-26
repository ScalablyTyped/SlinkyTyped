package typingsSlinky.semanticUiReact.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.semanticUiReact.genericMod.SemanticTRANSITIONS
import typingsSlinky.semanticUiReact.transitionTransitionMod.TransitionPropDuration
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@scala.inline
class SharedBuilder_TransitionGroupProps_897508211[R <: js.Object] (val args: js.Array[js.Any])
  extends AnyVal
     with StBuildingComponent[tag.type, R] {
  
  @scala.inline
  def animation(value: SemanticTRANSITIONS | String): this.type = set("animation", value.asInstanceOf[js.Any])
  
  @scala.inline
  def as(value: js.Any): this.type = set("as", value.asInstanceOf[js.Any])
  
  @scala.inline
  def directional(value: Boolean): this.type = set("directional", value.asInstanceOf[js.Any])
  
  @scala.inline
  def duration(value: Double | String | TransitionPropDuration): this.type = set("duration", value.asInstanceOf[js.Any])
}
