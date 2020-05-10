package typingsSlinky.webcl.WEBCL

import typingsSlinky.webcl.webclNumbers.`0x11F0`
import typingsSlinky.webcl.webclNumbers.`0x11F1`
import typingsSlinky.webcl.webclNumbers.`0x11F3`
import typingsSlinky.webcl.webclNumbers.`0x11F4`
import typingsSlinky.webcl.webclNumbers.`0x11F5`
import typingsSlinky.webcl.webclNumbers.`0x11F6`
import typingsSlinky.webcl.webclNumbers.`0x11F7`
import typingsSlinky.webcl.webclNumbers.`0x11F8`
import typingsSlinky.webcl.webclNumbers.`0x11F9`
import typingsSlinky.webcl.webclNumbers.`0x11FA`
import typingsSlinky.webcl.webclNumbers.`0x11FE`
import typingsSlinky.webcl.webclNumbers.`0x1201`
import typingsSlinky.webcl.webclNumbers.`0x1202`
import typingsSlinky.webcl.webclNumbers.`0x1203`
import typingsSlinky.webcl.webclNumbers.`0x1204`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* cl_command_type */
/* Rewritten from type alias, can be one of: 
  - typingsSlinky.webcl.webclNumbers.`0x11F0`
  - typingsSlinky.webcl.webclNumbers.`0x11F1`
  - typingsSlinky.webcl.webclNumbers.`0x11F3`
  - typingsSlinky.webcl.webclNumbers.`0x11F4`
  - typingsSlinky.webcl.webclNumbers.`0x11F5`
  - typingsSlinky.webcl.webclNumbers.`0x11F6`
  - typingsSlinky.webcl.webclNumbers.`0x11F7`
  - typingsSlinky.webcl.webclNumbers.`0x11F8`
  - typingsSlinky.webcl.webclNumbers.`0x11F9`
  - typingsSlinky.webcl.webclNumbers.`0x11FA`
  - typingsSlinky.webcl.webclNumbers.`0x11FE`
  - typingsSlinky.webcl.webclNumbers.`0x1201`
  - typingsSlinky.webcl.webclNumbers.`0x1202`
  - typingsSlinky.webcl.webclNumbers.`0x1203`
  - typingsSlinky.webcl.webclNumbers.`0x1204`
*/
trait CommandType extends js.Object

object CommandType {
  @scala.inline
  def COMMAND_COPY_BUFFER: `0x11F5` = 0x11F5.asInstanceOf[`0x11F5`]
  @scala.inline
  def COMMAND_COPY_BUFFER_RECT: `0x1203` = 0x1203.asInstanceOf[`0x1203`]
  @scala.inline
  def COMMAND_COPY_BUFFER_TO_IMAGE: `0x11FA` = 0x11FA.asInstanceOf[`0x11FA`]
  @scala.inline
  def COMMAND_COPY_IMAGE: `0x11F8` = 0x11F8.asInstanceOf[`0x11F8`]
  @scala.inline
  def COMMAND_COPY_IMAGE_TO_BUFFER: `0x11F9` = 0x11F9.asInstanceOf[`0x11F9`]
  //COMMAND_MAP_BUFFER                        = 0x11FB, // disallowed
  //COMMAND_MAP_IMAGE                         = 0x11FC, // disallowed
  //COMMAND_UNMAP_MEM_OBJECT                  = 0x11FD, // disallowed
  @scala.inline
  def COMMAND_MARKER: `0x11FE` = 0x11FE.asInstanceOf[`0x11FE`]
  @scala.inline
  def COMMAND_NDRANGE_KERNEL: `0x11F0` = 0x11F0.asInstanceOf[`0x11F0`]
  //COMMAND_NATIVE_KERNEL                     = 0x11F2, // disallowed
  @scala.inline
  def COMMAND_READ_BUFFER: `0x11F3` = 0x11F3.asInstanceOf[`0x11F3`]
  //COMMAND_ACQUIRE_GL_OBJECTS                = 0x11FF, // moved to extension
  //COMMAND_RELEASE_GL_OBJECTS                = 0x1200, // moved to extension
  @scala.inline
  def COMMAND_READ_BUFFER_RECT: `0x1201` = 0x1201.asInstanceOf[`0x1201`]
  @scala.inline
  def COMMAND_READ_IMAGE: `0x11F6` = 0x11F6.asInstanceOf[`0x11F6`]
  @scala.inline
  def COMMAND_TASK: `0x11F1` = 0x11F1.asInstanceOf[`0x11F1`]
  @scala.inline
  def COMMAND_USER: `0x1204` = 0x1204.asInstanceOf[`0x1204`]
  @scala.inline
  def COMMAND_WRITE_BUFFER: `0x11F4` = 0x11F4.asInstanceOf[`0x11F4`]
  @scala.inline
  def COMMAND_WRITE_BUFFER_RECT: `0x1202` = 0x1202.asInstanceOf[`0x1202`]
  @scala.inline
  def COMMAND_WRITE_IMAGE: `0x11F7` = 0x11F7.asInstanceOf[`0x11F7`]
}

