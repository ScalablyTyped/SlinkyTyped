package typingsSlinky.slickgrid.Slick

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Range extends StObject {
  
  /***
    * Returns whether a range contains a given cell.
    * @method contains
    * @param row {Integer}
    * @param cell {Integer}
    * @return {Boolean}
    */
  def contains(row: Double, cell: Double): Boolean = js.native
  
  /***
    * @property fromCell
    * @type {Integer}
    */
  var fromCell: Double = js.native
  
  /***
    * @property fromRow
    * @type {Integer}
    */
  var fromRow: Double = js.native
  
  /***
    * Returns whether a range represents a single cell.
    * @method isSingleCell
    * @return {Boolean}
    */
  def isSingleCell(): Boolean = js.native
  
  /***
    * Returns whether a range represents a single row.
    * @method isSingleRow
    * @return {Boolean}
    */
  def isSingleRow(): Boolean = js.native
  
  /***
    * @property toCell
    * @type {Integer}
    */
  var toCell: Double = js.native
  
  /***
    * @property toRow
    * @type {Integer}
    */
  var toRow: Double = js.native
}
object Range {
  
  @scala.inline
  def apply(
    contains: (Double, Double) => Boolean,
    fromCell: Double,
    fromRow: Double,
    isSingleCell: () => Boolean,
    isSingleRow: () => Boolean,
    toCell: Double,
    toRow: Double
  ): Range = {
    val __obj = js.Dynamic.literal(contains = js.Any.fromFunction2(contains), fromCell = fromCell.asInstanceOf[js.Any], fromRow = fromRow.asInstanceOf[js.Any], isSingleCell = js.Any.fromFunction0(isSingleCell), isSingleRow = js.Any.fromFunction0(isSingleRow), toCell = toCell.asInstanceOf[js.Any], toRow = toRow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Range]
  }
  
  @scala.inline
  implicit class RangeMutableBuilder[Self <: Range] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContains(value: (Double, Double) => Boolean): Self = StObject.set(x, "contains", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFromCell(value: Double): Self = StObject.set(x, "fromCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFromRow(value: Double): Self = StObject.set(x, "fromRow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSingleCell(value: () => Boolean): Self = StObject.set(x, "isSingleCell", js.Any.fromFunction0(value))
    
    @scala.inline
    def setIsSingleRow(value: () => Boolean): Self = StObject.set(x, "isSingleRow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setToCell(value: Double): Self = StObject.set(x, "toCell", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setToRow(value: Double): Self = StObject.set(x, "toRow", value.asInstanceOf[js.Any])
  }
}
