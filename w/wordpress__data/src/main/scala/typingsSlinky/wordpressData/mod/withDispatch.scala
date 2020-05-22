package typingsSlinky.wordpressData.mod

import slinky.core.ReactComponentClass
import typingsSlinky.wordpressData.anon.Select
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/data", "withDispatch")
@js.native
object withDispatch extends js.Object {
  def apply[DP, P, IP](
    mapDispatchToProps: js.Function3[
      /* disp */ js.Function1[/* key */ String, DispatcherMap], 
      /* ownProps */ P with IP, 
      /* registry */ Select, 
      DP
    ]
  ): js.Function1[/* component */ ReactComponentClass[P with IP with DP], ReactComponentClass[P]] = js.native
}

