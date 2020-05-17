package typingsSlinky.tslint.exclusionDescriptorsMod

import typingsSlinky.tslint.blockExclusionMod.IBlockExclusionDescriptor
import typingsSlinky.tslint.classExclusionMod.IClassExclusionDescriptor
import typingsSlinky.tslint.tagExclusionMod.ITagExclusionDescriptor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tslint.blockExclusionMod.IBlockExclusionDescriptor
  - typingsSlinky.tslint.classExclusionMod.IClassExclusionDescriptor
  - typingsSlinky.tslint.tagExclusionMod.ITagExclusionDescriptor
*/
trait ExclusionDescriptor extends InputExclusionDescriptor

object ExclusionDescriptor {
  @scala.inline
  implicit def apply(value: IBlockExclusionDescriptor): ExclusionDescriptor = value.asInstanceOf[ExclusionDescriptor]
  @scala.inline
  implicit def apply(value: IClassExclusionDescriptor): ExclusionDescriptor = value.asInstanceOf[ExclusionDescriptor]
  @scala.inline
  implicit def apply(value: ITagExclusionDescriptor): ExclusionDescriptor = value.asInstanceOf[ExclusionDescriptor]
}

