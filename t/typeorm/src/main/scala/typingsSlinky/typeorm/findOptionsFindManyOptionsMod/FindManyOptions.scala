package typingsSlinky.typeorm.findOptionsFindManyOptionsMod

import typingsSlinky.typeorm.findOptionsFindOneOptionsMod.FindOneOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FindManyOptions[Entity] extends FindOneOptions[Entity] {
  
  /**
    * Offset (paginated) where from entities should be taken.
    */
  var skip: js.UndefOr[Double] = js.native
  
  /**
    * Limit (paginated) - max number of entities should be taken.
    */
  var take: js.UndefOr[Double] = js.native
}
object FindManyOptions {
  
  @scala.inline
  def apply[Entity](): FindManyOptions[Entity] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FindManyOptions[Entity]]
  }
  
  @scala.inline
  implicit class FindManyOptionsOps[Self <: FindManyOptions[_], Entity] (val x: Self with FindManyOptions[Entity]) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setSkip(value: Double): Self = this.set("skip", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSkip: Self = this.set("skip", js.undefined)
    
    @scala.inline
    def setTake(value: Double): Self = this.set("take", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTake: Self = this.set("take", js.undefined)
  }
}
