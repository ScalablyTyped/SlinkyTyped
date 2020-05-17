package typingsSlinky.typescriptServices.TypeScript.Collections

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StringTable extends js.Object {
  var count: js.Any = js.native
  var entries: js.Any = js.native
  def addCharArray(key: js.Array[Double], start: Double, len: Double): String = js.native
  /* private */ def addEntry(text: js.Any, hashCode: js.Any): js.Any = js.native
  /* private */ def findCharArrayEntry(key: js.Any, start: js.Any, len: js.Any, hashCode: js.Any): js.Any = js.native
  /* private */ def grow(): js.Any = js.native
}

object StringTable {
  @scala.inline
  def apply(
    addCharArray: (js.Array[Double], Double, Double) => String,
    addEntry: (js.Any, js.Any) => js.Any,
    count: js.Any,
    entries: js.Any,
    findCharArrayEntry: (js.Any, js.Any, js.Any, js.Any) => js.Any,
    grow: () => js.Any
  ): StringTable = {
    val __obj = js.Dynamic.literal(addCharArray = js.Any.fromFunction3(addCharArray), addEntry = js.Any.fromFunction2(addEntry), count = count.asInstanceOf[js.Any], entries = entries.asInstanceOf[js.Any], findCharArrayEntry = js.Any.fromFunction4(findCharArrayEntry), grow = js.Any.fromFunction0(grow))
    __obj.asInstanceOf[StringTable]
  }
  @scala.inline
  implicit class StringTableOps[Self <: StringTable] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withAddCharArray(value: (js.Array[Double], Double, Double) => String): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addCharArray")(js.Any.fromFunction3(value))
        ret
    }
    @scala.inline
    def withAddEntry(value: (js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("addEntry")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCount(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEntries(value: js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("entries")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFindCharArrayEntry(value: (js.Any, js.Any, js.Any, js.Any) => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("findCharArrayEntry")(js.Any.fromFunction4(value))
        ret
    }
    @scala.inline
    def withGrow(value: () => js.Any): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("grow")(js.Any.fromFunction0(value))
        ret
    }
  }
  
}

