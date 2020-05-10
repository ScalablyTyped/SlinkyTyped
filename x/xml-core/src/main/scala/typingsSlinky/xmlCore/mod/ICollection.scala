package typingsSlinky.xmlCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ICollection[I] extends js.Object {
  val Count: Double = js.native
  def Add(item: I): Unit = js.native
  def Clear(): Unit = js.native
  def Every(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
  def Filter(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): ICollection[I] = js.native
  def ForEach(cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit]): Unit = js.native
  def GetIterator(): js.Array[I] = js.native
  def IsEmpty(): Boolean = js.native
  def Item(index: Double): I | Null = js.native
  def Map[U](cb: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], U]): ICollection[U] = js.native
  def Pop(): js.UndefOr[I] = js.native
  def RemoveAt(index: Double): Unit = js.native
  def Some(cb: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean]): Boolean = js.native
  def Sort(cb: js.Function2[/* a */ I, /* b */ I, Double]): ICollection[I] = js.native
}

object ICollection {
  @scala.inline
  def apply[I](
    Add: I => Unit,
    Clear: () => Unit,
    Count: Double,
    Every: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean,
    Filter: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => ICollection[I],
    ForEach: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Unit,
    GetIterator: () => js.Array[I],
    IsEmpty: () => Boolean,
    Item: Double => I | Null,
    Map: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any],
    Pop: () => js.UndefOr[I],
    RemoveAt: Double => Unit,
    Some: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean,
    Sort: js.Function2[/* a */ I, /* b */ I, Double] => ICollection[I]
  ): ICollection[I] = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction1(Add), Clear = js.Any.fromFunction0(Clear), Count = Count.asInstanceOf[js.Any], Every = js.Any.fromFunction1(Every), Filter = js.Any.fromFunction1(Filter), ForEach = js.Any.fromFunction1(ForEach), GetIterator = js.Any.fromFunction0(GetIterator), IsEmpty = js.Any.fromFunction0(IsEmpty), Item = js.Any.fromFunction1(Item), Map = js.Any.fromFunction1(Map), Pop = js.Any.fromFunction0(Pop), RemoveAt = js.Any.fromFunction1(RemoveAt), Some = js.Any.fromFunction1(Some), Sort = js.Any.fromFunction1(Sort))
    __obj.asInstanceOf[ICollection[I]]
  }
  @scala.inline
  implicit class ICollectionOps[Self[i] <: ICollection[i], I] (val x: Self[I]) extends AnyVal {
    @scala.inline
    def duplicate: Self[I] = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self[I]]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self[I] with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self[I] with Other]
    @scala.inline
    def withAdd(value: I => Unit): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Add")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withClear(value: () => Unit): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Clear")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withCount(value: Double): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Count")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withEvery(
      value: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean
    ): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Every")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withFilter(
      value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => ICollection[I]
    ): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Filter")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withForEach(value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], Unit] => Unit): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("ForEach")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withGetIterator(value: () => js.Array[I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("GetIterator")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withIsEmpty(value: () => Boolean): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("IsEmpty")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withItem(value: Double => I | Null): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Item")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withMap(
      value: js.Function3[/* item */ I, /* index */ Double, /* array */ js.Array[I], js.Any] => ICollection[js.Any]
    ): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Map")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withPop(value: () => js.UndefOr[I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Pop")(js.Any.fromFunction0(value))
        ret
    }
    @scala.inline
    def withRemoveAt(value: Double => Unit): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("RemoveAt")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSome(
      value: js.Function3[/* value */ I, /* index */ Double, /* array */ js.Array[I], Boolean] => Boolean
    ): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Some")(js.Any.fromFunction1(value))
        ret
    }
    @scala.inline
    def withSort(value: js.Function2[/* a */ I, /* b */ I, Double] => ICollection[I]): Self[I] = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("Sort")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

