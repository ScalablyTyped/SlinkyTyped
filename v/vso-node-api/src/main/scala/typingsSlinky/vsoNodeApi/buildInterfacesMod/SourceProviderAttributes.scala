package typingsSlinky.vsoNodeApi.buildInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SourceProviderAttributes extends js.Object {
  /**
    * The name of the source provider.
    */
  var name: String = js.native
  /**
    * The capabilities supported by this source provider.
    */
  var supportedCapabilities: StringDictionary[Boolean] = js.native
  /**
    * The types of triggers supported by this source provider.
    */
  var supportedTriggers: js.Array[SupportedTrigger] = js.native
}

object SourceProviderAttributes {
  @scala.inline
  def apply(
    name: String,
    supportedCapabilities: StringDictionary[Boolean],
    supportedTriggers: js.Array[SupportedTrigger]
  ): SourceProviderAttributes = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], supportedCapabilities = supportedCapabilities.asInstanceOf[js.Any], supportedTriggers = supportedTriggers.asInstanceOf[js.Any])
    __obj.asInstanceOf[SourceProviderAttributes]
  }
  @scala.inline
  implicit class SourceProviderAttributesOps[Self <: SourceProviderAttributes] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withName(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedCapabilities(value: StringDictionary[Boolean]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedCapabilities")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSupportedTriggers(value: js.Array[SupportedTrigger]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("supportedTriggers")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

