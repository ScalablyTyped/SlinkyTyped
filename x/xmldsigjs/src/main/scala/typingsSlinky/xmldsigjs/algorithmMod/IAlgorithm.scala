package typingsSlinky.xmldsigjs.algorithmMod

import org.scalajs.dom.crypto.Algorithm
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IAlgorithm extends js.Object {
  var algorithm: Algorithm = js.native
  var namespaceURI: String = js.native
  def getAlgorithmName(): String = js.native
}

object IAlgorithm {
  @scala.inline
  def apply(algorithm: Algorithm, getAlgorithmName: () => String, namespaceURI: String): IAlgorithm = {
    val __obj = js.Dynamic.literal(algorithm = algorithm.asInstanceOf[js.Any], getAlgorithmName = js.Any.fromFunction0(getAlgorithmName), namespaceURI = namespaceURI.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAlgorithm]
  }
  @scala.inline
  implicit class IAlgorithmOps[Self <: IAlgorithm] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAlgorithm(value: Algorithm): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("algorithm")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withGetAlgorithmName(value: () => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("getAlgorithmName")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withNamespaceURI(value: String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("namespaceURI")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

