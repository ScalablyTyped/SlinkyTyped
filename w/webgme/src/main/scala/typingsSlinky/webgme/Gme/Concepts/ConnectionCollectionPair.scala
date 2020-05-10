package typingsSlinky.webgme.Gme.Concepts

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionCollectionPair extends js.Object {
  var destinations: js.Array[ComposeChain] = js.native
  var sources: js.Array[ComposeChain] = js.native
}

object ConnectionCollectionPair {
  @scala.inline
  def apply(destinations: js.Array[ComposeChain], sources: js.Array[ComposeChain]): ConnectionCollectionPair = {
    val __obj = js.Dynamic.literal(destinations = destinations.asInstanceOf[js.Any], sources = sources.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionCollectionPair]
  }
  @scala.inline
  implicit class ConnectionCollectionPairOps[Self <: ConnectionCollectionPair] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withDestinations(value: js.Array[ComposeChain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("destinations")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withSources(value: js.Array[ComposeChain]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("sources")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

