package typingsSlinky.vue.optionsMod

import typingsSlinky.vue.AnonEvent
import typingsSlinky.vue.vnodeMod.VNode
import typingsSlinky.vue.vueMod.CreateElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionalComponentOptions[Props, PropDefs] extends js.Object {
  var functional: Boolean = js.native
  var inject: js.UndefOr[InjectOptions] = js.native
  var model: js.UndefOr[AnonEvent] = js.native
  var name: js.UndefOr[String] = js.native
  var props: js.UndefOr[PropDefs] = js.native
  var render: js.UndefOr[
    js.ThisFunction2[
      /* this */ js.UndefOr[scala.Nothing], 
      /* createElement */ CreateElement, 
      /* context */ RenderContext[Props], 
      VNode | js.Array[VNode]
    ]
  ] = js.native
}

object FunctionalComponentOptions {
  @scala.inline
  def apply[Props, PropDefs](functional: Boolean): FunctionalComponentOptions[Props, PropDefs] = {
    val __obj = js.Dynamic.literal(functional = functional.asInstanceOf[js.Any])
    __obj.asInstanceOf[FunctionalComponentOptions[Props, PropDefs]]
  }
  @scala.inline
  implicit class FunctionalComponentOptionsOps[Self[props, propdefs] <: FunctionalComponentOptions[props, propdefs], Props, PropDefs] (val x: Self[Props, PropDefs]) extends AnyVal {
    @scala.inline
    def duplicate: Self[Props, PropDefs] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[Props, PropDefs]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): (Self[Props, PropDefs]) with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[(Self[Props, PropDefs]) with Other]
    @scala.inline
    def withFunctional(value: Boolean): Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("functional")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withInject(value: InjectOptions): Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutInject: Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("inject")(js.undefined)
        ret
    }
    @scala.inline
    def withModel(value: AnonEvent): Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutModel: Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("model")(js.undefined)
        ret
    }
    @scala.inline
    def withName(value: String): Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutName: Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("name")(js.undefined)
        ret
    }
    @scala.inline
    def withProps(value: PropDefs): Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutProps: Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("props")(js.undefined)
        ret
    }
    @scala.inline
    def withRender(
      value: js.ThisFunction2[
          /* this */ js.UndefOr[scala.Nothing], 
          /* createElement */ CreateElement, 
          /* context */ RenderContext[Props], 
          VNode | js.Array[VNode]
        ]
    ): Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withoutRender: Self[Props, PropDefs] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("render")(js.undefined)
        ret
    }
  }
  
}

