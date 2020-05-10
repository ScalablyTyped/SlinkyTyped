package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPullTypeCollection extends js.Object {
  def getLength(): Double = js.native
  def getTypeAtIndex(index: Double): PullTypeSymbol = js.native
}

object IPullTypeCollection {
  @scala.inline
  def apply(getLength: () => Double, getTypeAtIndex: Double => PullTypeSymbol): IPullTypeCollection = {
    val __obj = js.Dynamic.literal(getLength = js.Any.fromFunction0(getLength), getTypeAtIndex = js.Any.fromFunction1(getTypeAtIndex))
    __obj.asInstanceOf[IPullTypeCollection]
  }
  @scala.inline
  implicit class IPullTypeCollectionOps[Self <: IPullTypeCollection] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withGetLength(value: () => Double): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getLength")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withGetTypeAtIndex(value: Double => PullTypeSymbol): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getTypeAtIndex")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

