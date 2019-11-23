package typingsSlinky.atStorybookApi.components

import org.scalablytyped.runtime.StringDictionary
import slinky.core.BuildingComponent
import slinky.core.ExternalComponentWithAttributesWithRefType
import slinky.web.html.`*`.tag
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* This component has complicated props, you'll have to assemble `props` yourself using js.Dynamic.literal(...) or similar. QualifiedName(List(Name(typingsSlinky), Name(atStorybookApi), Name(atStorybookApiMod), Name(Props))) was not a @ScalaJSDefined trait */
object Provider
  extends ExternalComponentWithAttributesWithRefType[tag.type, typingsSlinky.atStorybookApi.atStorybookApiMod.Provider] {
  override val component: String | js.Object = js.constructorOf[typingsSlinky.atStorybookApi.atStorybookApiMod.Provider].asInstanceOf[String | js.Object]
  def apply(
    props: typingsSlinky.atStorybookApi.atStorybookApiMod.Props with js.Object,
    overrides: StringDictionary[js.Any] = null
  ): BuildingComponent[tag.type, typingsSlinky.atStorybookApi.atStorybookApiMod.Provider] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, props)
    if (overrides != null) js.Dynamic.global.Object.assign(__obj, overrides)
    super.apply(__obj.asInstanceOf[Props])
  }
  type Props = typingsSlinky.atStorybookApi.atStorybookApiMod.Props
}

