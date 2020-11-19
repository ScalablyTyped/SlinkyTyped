package typingsSlinky.tstl.anon

import typingsSlinky.tstl.mapElementListMod.MapElementList.Iterator
import typingsSlinky.tstl.mapElementListMod.MapElementList.ReverseIterator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined tstl.tstl/internal/container/associative/MapElementList.MapElementList.Iterator</ * import warning: RewrittenClass.unapply cls was tparam Key * / any, / * import warning: RewrittenClass.unapply cls was tparam T * / any, / * import warning: RewrittenClass.unapply cls was tparam Unique * / any, / * import warning: RewrittenClass.unapply cls was tparam Source * / any> */
@js.native
trait Iteratoranyanyanyany extends js.Object {
  
  /* protected */ def _Try_value(): Unit = js.native
  
  def equals(
    obj: Iterator[
      /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
      /* import warning: RewrittenClass.unapply cls was tparam Source */ _
    ]
  ): Boolean = js.native
  
  /**
    * @inheritDoc
    */
  def first: js.Any = js.native
  /**
    * The first, key element.
    */
  @JSName("first")
  val first_FIteratoranyanyanyany: /* import warning: RewrittenClass.unapply cls was tparam Key */ js.Any = js.native
  
  var list_ : js.Any = js.native
  
  def next(): Iterator[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _
  ] = js.native
  
  var next_ : js.Any = js.native
  
  def prev(): Iterator[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _
  ] = js.native
  
  var prev_ : js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def reverse(): ReverseIterator[
    /* import warning: RewrittenClass.unapply cls was tparam Key */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam T */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Unique */ _, 
    /* import warning: RewrittenClass.unapply cls was tparam Source */ _
  ] = js.native
  
  /**
    * @inheritDoc
    */
  def second: js.Any = js.native
  /**
    * @inheritDoc
    */
  def second_=(`val`: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any): Unit = js.native
  /**
    * The second, stored element.
    */
  @JSName("second")
  var second_FIteratoranyanyanyany: /* import warning: RewrittenClass.unapply cls was tparam T */ js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def source(): js.Any = js.native
  
  /**
    * @inheritDoc
    */
  def value: Entryanyany = js.native
  
  var value_ : Entryanyany = js.native
  
  @JSName("value")
  val value_FIteratoranyanyanyany: Entryanyany = js.native
}
