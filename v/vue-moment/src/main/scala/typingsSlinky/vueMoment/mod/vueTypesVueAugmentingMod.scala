package typingsSlinky.vueMoment.mod

import typingsSlinky.moment.mod.Moment
import typingsSlinky.moment.mod.MomentFormatSpecification
import typingsSlinky.moment.mod.MomentInput
import typingsSlinky.vueMoment.mod.VueMomentPlugin.Options
import typingsSlinky.vueMoment.mod.VueMomentPlugin.VueStatic
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue/types/vue", JSImport.Namespace)
@js.native
object vueTypesVueAugmentingMod extends js.Object {
  
  @js.native
  trait Vue extends js.Object {
    
    @JSName("$moment")
    def $moment(): Moment = js.native
    @JSName("$moment")
    def $moment(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: js.UndefOr[scala.Nothing],
      strict: Boolean
    ): Moment = js.native
    @JSName("$moment")
    def $moment(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], language: String): Moment = js.native
    @JSName("$moment")
    def $moment(
      inp: js.UndefOr[MomentInput],
      format: js.UndefOr[MomentFormatSpecification],
      language: String,
      strict: Boolean
    ): Moment = js.native
    @JSName("$moment")
    def $moment(inp: js.UndefOr[MomentInput], format: js.UndefOr[MomentFormatSpecification], strict: Boolean): Moment = js.native
    @JSName("$moment")
    def $moment(inp: js.UndefOr[MomentInput], format: MomentFormatSpecification): Moment = js.native
    @JSName("$moment")
    def $moment(inp: MomentInput): Moment = js.native
    @JSName("$moment")
    def $moment(options: Options): Unit = js.native
    @JSName("$moment")
    var $moment_Original: VueStatic = js.native
  }
}
