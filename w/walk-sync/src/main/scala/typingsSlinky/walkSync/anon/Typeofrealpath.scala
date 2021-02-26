package typingsSlinky.walkSync.anon

import typingsSlinky.node.Buffer
import typingsSlinky.node.BufferEncoding
import typingsSlinky.node.NodeJS.ErrnoException
import typingsSlinky.node.fsMod.BaseEncodingOptions
import typingsSlinky.node.fsMod.BufferEncodingOption
import typingsSlinky.node.fsMod.PathLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrealpath extends StObject {
  
  def apply(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BaseEncodingOptions,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def apply(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
  
  def native(
    path: PathLike,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: js.UndefOr[scala.Nothing],
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: String,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String | Buffer, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: Null,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: BufferEncoding,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ String, Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: BaseEncodingOptions,
    callback: js.Function2[ErrnoException | Null, Buffer | (/* resolvedPath */ String), Unit]
  ): Unit = js.native
  def native(
    path: PathLike,
    options: BufferEncodingOption,
    callback: js.Function2[/* err */ ErrnoException | Null, /* resolvedPath */ Buffer, Unit]
  ): Unit = js.native
}
