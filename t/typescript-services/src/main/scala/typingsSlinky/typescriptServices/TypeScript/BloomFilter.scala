package typingsSlinky.typescriptServices.TypeScript

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BloomFilter extends js.Object {
  var bitArray: js.Any = js.native
  var hashFunctionCount: js.Any = js.native
  def add(value: String): Unit = js.native
  def addKeys(keys: IIndexable[_]): Unit = js.native
  /* private */ def computeHash(key: js.Any, seed: js.Any): js.Any = js.native
  def isEquivalent(filter: BloomFilter): Boolean = js.native
  def probablyContains(value: String): Boolean = js.native
}

object BloomFilter {
  @scala.inline
  def apply(
    add: String => Unit,
    addKeys: IIndexable[_] => Unit,
    bitArray: js.Any,
    computeHash: (js.Any, js.Any) => js.Any,
    hashFunctionCount: js.Any,
    isEquivalent: BloomFilter => Boolean,
    probablyContains: String => Boolean
  ): BloomFilter = {
    val __obj = js.Dynamic.literal(add = js.Any.fromFunction1(add), addKeys = js.Any.fromFunction1(addKeys), bitArray = bitArray.asInstanceOf[js.Any], computeHash = js.Any.fromFunction2(computeHash), hashFunctionCount = hashFunctionCount.asInstanceOf[js.Any], isEquivalent = js.Any.fromFunction1(isEquivalent), probablyContains = js.Any.fromFunction1(probablyContains))
    __obj.asInstanceOf[BloomFilter]
  }
  @scala.inline
  implicit class BloomFilterOps[Self <: BloomFilter] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAdd(value: String => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withAddKeys(value: IIndexable[_] => Unit): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addKeys")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withBitArray(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("bitArray")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withComputeHash(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("computeHash")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withHashFunctionCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("hashFunctionCount")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withIsEquivalent(value: BloomFilter => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("isEquivalent")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withProbablyContains(value: String => Boolean): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("probablyContains")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

