package typingsSlinky.atStorybookApi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import typingsSlinky.atStorybookApi.atStorybookApiMod.Combo
import typingsSlinky.atStorybookApi.atStorybookApiMod.ConsumerProps
import typingsSlinky.atStorybookApi.atStorybookApiMod.SubState
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. Not @ScalaJSDefined trait */
object Consumer
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atStorybookApi.atStorybookApiMod.Consumer] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atStorybookApi.atStorybookApiMod.Consumer].asInstanceOf[String | js.Object]
  def apply(props: (ConsumerProps[SubState, Combo]) with js.Object, overrides: StringDictionary[js.Any] = null): BuildingComponent[tag.type, typingsSlinky.atStorybookApi.atStorybookApiMod.Consumer] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = ConsumerProps[js.Any, js.Any]
}

