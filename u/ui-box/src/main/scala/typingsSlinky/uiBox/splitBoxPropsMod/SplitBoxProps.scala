package typingsSlinky.uiBox.splitBoxPropsMod

import typingsSlinky.std.Exclude
import typingsSlinky.std.Pick
import typingsSlinky.uiBox.typesEnhancersMod.EnhancerProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SplitBoxProps[P /* <: EnhancerProps */] extends js.Object {
  var matchedProps: Pick[
    P, 
    /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
  ] = js.native
  var remainingProps: Pick[
    P, 
    Exclude[
      /* keyof P */ String, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
    ]
  ] = js.native
}

object SplitBoxProps {
  @scala.inline
  def apply[P](
    matchedProps: Pick[
      P, 
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
    ],
    remainingProps: Pick[
      P, 
      Exclude[
        /* keyof P */ String, 
        /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
      ]
    ]
  ): SplitBoxProps[P] = {
    val __obj = js.Dynamic.literal(matchedProps = matchedProps.asInstanceOf[js.Any], remainingProps = remainingProps.asInstanceOf[js.Any])
    __obj.asInstanceOf[SplitBoxProps[P]]
  }
  @scala.inline
  implicit class SplitBoxPropsOps[Self[p] <: SplitBoxProps[p], P] (val x: Self[P]) extends AnyVal {
    @scala.inline
    def duplicate: Self[P] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[P]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[P] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[P] with Other]
    @scala.inline
    def withMatchedProps(
      value: Pick[
          P, 
          /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
        ]
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("matchedProps")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withRemainingProps(
      value: Pick[
          P, 
          Exclude[
            /* keyof P */ String, 
            /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 140 */ js.Any
          ]
        ]
    ): Self[P] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("remainingProps")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

