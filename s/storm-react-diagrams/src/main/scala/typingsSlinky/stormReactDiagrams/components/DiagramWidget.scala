package typingsSlinky.stormReactDiagrams.components

import slinky.web.html.`*`.tag
import typingsSlinky.StBuildingComponent
import typingsSlinky.stormReactDiagrams.baseActionMod.BaseAction
import typingsSlinky.stormReactDiagrams.diagramEngineMod.DiagramEngine
import typingsSlinky.stormReactDiagrams.diagramWidgetMod.DiagramProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object DiagramWidget {
  @JSImport("storm-react-diagrams", "DiagramWidget")
  @js.native
  object component extends js.Object
  
  @scala.inline
  class Builder (val args: js.Array[js.Any])
    extends AnyVal
       with StBuildingComponent[tag.type, typingsSlinky.stormReactDiagrams.mod.DiagramWidget] {
    @scala.inline
    def actionStartedFiring(value: /* action */ BaseAction => Boolean): this.type = set("actionStartedFiring", js.Any.fromFunction1(value))
    @scala.inline
    def actionStillFiring(value: /* action */ BaseAction => Unit): this.type = set("actionStillFiring", js.Any.fromFunction1(value))
    @scala.inline
    def actionStoppedFiring(value: /* action */ BaseAction => Unit): this.type = set("actionStoppedFiring", js.Any.fromFunction1(value))
    @scala.inline
    def allowCanvasTranslation(value: Boolean): this.type = set("allowCanvasTranslation", value.asInstanceOf[js.Any])
    @scala.inline
    def allowCanvasZoom(value: Boolean): this.type = set("allowCanvasZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def allowLooseLinks(value: Boolean): this.type = set("allowLooseLinks", value.asInstanceOf[js.Any])
    @scala.inline
    def baseClass(value: String): this.type = set("baseClass", value.asInstanceOf[js.Any])
    @scala.inline
    def className(value: String): this.type = set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeysVarargs(value: Double*): this.type = set("deleteKeys", js.Array(value :_*))
    @scala.inline
    def deleteKeys(value: js.Array[Double]): this.type = set("deleteKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def extraProps(value: js.Any): this.type = set("extraProps", value.asInstanceOf[js.Any])
    @scala.inline
    def inverseZoom(value: Boolean): this.type = set("inverseZoom", value.asInstanceOf[js.Any])
    @scala.inline
    def maxNumberPointsPerLink(value: Double): this.type = set("maxNumberPointsPerLink", value.asInstanceOf[js.Any])
    @scala.inline
    def smartRouting(value: Boolean): this.type = set("smartRouting", value.asInstanceOf[js.Any])
  }
  
  def withProps(p: DiagramProps): Builder = new Builder(js.Array(this.component, p.asInstanceOf[js.Any]))
  @scala.inline
  def apply(diagramEngine: DiagramEngine): Builder = {
    val __props = js.Dynamic.literal(diagramEngine = diagramEngine.asInstanceOf[js.Any])
    new Builder(js.Array(this.component, __props.asInstanceOf[DiagramProps]))
  }
}

