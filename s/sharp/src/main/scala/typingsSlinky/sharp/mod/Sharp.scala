package typingsSlinky.sharp.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Duplex
import typingsSlinky.sharp.anon.Brightness
import typingsSlinky.sharp.anon.Data
import typingsSlinky.sharp.anon.ResolveWithObject
import typingsSlinky.sharp.anon.`0`
import typingsSlinky.std.ArrayLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Sharp extends Duplex {
  
  /**
    * Perform a bitwise boolean operation on all input image channels (bands) to produce a single channel output image.
    * @param boolOp one of "and", "or" or "eor" to perform that bitwise operation, like the C logic operators &, | and ^ respectively.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def bandbool(boolOp: String): Sharp = js.native
  
  /**
    * Blur the image.
    * When used without parameters, performs a fast, mild blur of the output image.
    * When a sigma is provided, performs a slower, more accurate Gaussian blur.
    * When a boolean sigma is provided, ether blur mild or disable blur
    * @param sigma a value between 0.3 and 1000 representing the sigma of the Gaussian mask, where sigma = 1 + radius / 2.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def blur(): Sharp = js.native
  def blur(sigma: Boolean): Sharp = js.native
  def blur(sigma: Double): Sharp = js.native
  
  /**
    * Perform a bitwise boolean operation with operand image.
    * This operation creates an output image where each pixel is the result of the selected bitwise boolean operation between the corresponding pixels of the input images.
    * @param operand Buffer containing image data or String containing the path to an image file.
    * @param operator one of "and", "or" or "eor" to perform that bitwise operation, like the C logic operators &, | and ^ respectively.
    * @param options describes operand when using raw pixel data.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def boolean(operand: String, operator: String): Sharp = js.native
  def boolean(operand: String, operator: String, options: typingsSlinky.sharp.anon.Raw): Sharp = js.native
  def boolean(operand: Buffer, operator: String): Sharp = js.native
  def boolean(operand: Buffer, operator: String, options: typingsSlinky.sharp.anon.Raw): Sharp = js.native
  
  //#endregion
  //#region Composite functions
  /**
    * Composite image(s) over the processed (resized, extracted etc.) image.
    *
    * The images to composite must be the same size or smaller than the processed image.
    * If both `top` and `left` options are provided, they take precedence over `gravity`.
    * @param images - Ordered list of images to composite
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def composite(images: js.Array[OverlayOptions]): Sharp = js.native
  
  /**
    * Convolve the image with the specified kernel.
    * @param kernel the specified kernel
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def convolve(kernel: Kernel_): Sharp = js.native
  
  /**
    * Ensure alpha channel, if missing. The added alpha channel will be fully opaque. This is a no-op if the image already has an alpha channel.
    * @returns A sharp instance that can be used to chain operations
    */
  def ensureAlpha(): Sharp = js.native
  
  /**
    * Extends/pads the edges of the image with the provided background colour.
    * This operation will always occur after resizing and extraction, if any.
    * @param extend single pixel count to add to all edges or an Object with per-edge counts
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def extend(extend: Double): Sharp = js.native
  def extend(extend: ExtendOptions): Sharp = js.native
  
  /**
    * Extract a region of the image.
    *  - Use extract() before resize() for pre-resize extraction.
    *  - Use extract() after resize() for post-resize extraction.
    *  - Use extract() before and after for both.
    *
    * @param region The region to extract
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def extract(region: Region): Sharp = js.native
  
  def extractChannel(channel: String): Sharp = js.native
  /**
    * Extract a single channel from a multi-channel image.
    * @param channel zero-indexed band number to extract, or red, green or blue as alternative to 0, 1 or 2 respectively.
    * @throws {Error} Invalid channel
    * @returns A sharp instance that can be used to chain operations
    */
  def extractChannel(channel: Double): Sharp = js.native
  
  /**
    * Merge alpha transparency channel, if any, with background.
    * @param flatten true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def flatten(): Sharp = js.native
  def flatten(flatten: Boolean): Sharp = js.native
  def flatten(flatten: FlattenOptions): Sharp = js.native
  
  /**
    * Flip the image about the vertical Y axis. This always occurs after rotation, if any.
    * The use of flip implies the removal of the EXIF Orientation tag, if any.
    * @param flip true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def flip(): Sharp = js.native
  def flip(flip: Boolean): Sharp = js.native
  
  /**
    * Flop the image about the horizontal X axis. This always occurs after rotation, if any.
    * The use of flop implies the removal of the EXIF Orientation tag, if any.
    * @param flop true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def flop(): Sharp = js.native
  def flop(flop: Boolean): Sharp = js.native
  
  /**
    * Apply a gamma correction by reducing the encoding (darken) pre-resize at a factor of 1/gamma then increasing the encoding (brighten) post-resize at a factor of gamma.
    * This can improve the perceived brightness of a resized image in non-linear colour spaces.
    * JPEG and WebP input images will not take advantage of the shrink-on-load performance optimisation when applying a gamma correction.
    * @param gamma value between 1.0 and 3.0. (optional, default 2.2)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def gamma(): Sharp = js.native
  def gamma(gamma: Double): Sharp = js.native
  
  /**
    * Alternative spelling of greyscale().
    * @param grayscale true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def grayscale(): Sharp = js.native
  def grayscale(grayscale: Boolean): Sharp = js.native
  
  /**
    * Convert to 8-bit greyscale; 256 shades of grey.
    * This is a linear operation.
    * If the input image is in a non-linear colour space such as sRGB, use gamma() with greyscale() for the best results.
    * By default the output image will be web-friendly sRGB and contain three (identical) color channels.
    * This may be overridden by other sharp operations such as toColourspace('b-w'), which will produce an output image containing one color channel.
    * An alpha channel may be present, and will be unchanged by the operation.
    * @param greyscale true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def greyscale(): Sharp = js.native
  def greyscale(greyscale: Boolean): Sharp = js.native
  
  /**
    * Join one or more channels to the image. The meaning of the added channels depends on the output colourspace, set with toColourspace().
    * By default the output image will be web-friendly sRGB, with additional channels interpreted as alpha channels. Channel ordering follows vips convention:
    *  - sRGB: 0: Red, 1: Green, 2: Blue, 3: Alpha.
    *  - CMYK: 0: Magenta, 1: Cyan, 2: Yellow, 3: Black, 4: Alpha.
    *
    * Buffers may be any of the image formats supported by sharp: JPEG, PNG, WebP, GIF, SVG, TIFF or raw pixel image data.
    * For raw pixel input, the options object should contain a raw attribute, which follows the format of the attribute of the same name in the sharp() constructor.
    * @param images one or more images (file paths, Buffers).
    * @param options image options, see sharp() constructor.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def joinChannel(images: String): Sharp = js.native
  def joinChannel(images: String, options: SharpOptions): Sharp = js.native
  def joinChannel(images: Buffer): Sharp = js.native
  def joinChannel(images: Buffer, options: SharpOptions): Sharp = js.native
  def joinChannel(images: ArrayLike[String | Buffer]): Sharp = js.native
  def joinChannel(images: ArrayLike[String | Buffer], options: SharpOptions): Sharp = js.native
  
  /**
    * Use these JPEG options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def jpeg(): Sharp = js.native
  def jpeg(options: JpegOptions): Sharp = js.native
  
  /**
    * Apply the linear formula a * input + b to the image (levels adjustment)
    * @param a multiplier (optional, default 1.0)
    * @param b offset (optional, default 0.0)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def linear(): Sharp = js.native
  def linear(a: js.UndefOr[scala.Nothing], b: Double): Sharp = js.native
  def linear(a: Double): Sharp = js.native
  def linear(a: Double, b: Double): Sharp = js.native
  def linear(a: Null, b: Double): Sharp = js.native
  
  /**
    * Apply median filter. When used without parameters the default window is 3x3.
    * @param size square mask size: size x size (optional, default 3)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def median(): Sharp = js.native
  def median(size: Double): Sharp = js.native
  
  /**
    * Fast access to (uncached) image metadata without decoding any compressed image data.
    * @returns A promise that resolves with a metadata object
    */
  def metadata(): js.Promise[Metadata] = js.native
  /**
    * Fast access to (uncached) image metadata without decoding any compressed image data.
    * @returns A sharp instance that can be used to chain operations
    */
  def metadata(callback: js.Function2[/* err */ js.Error, /* metadata */ Metadata, Unit]): Sharp = js.native
  
  /**
    * Transforms the image using brightness, saturation and hue rotation.
    * @param options describes the modulation
    * @returns A sharp instance that can be used to chain operations
    */
  def modulate(): Sharp = js.native
  def modulate(options: Brightness): Sharp = js.native
  
  /**
    * Produce the "negative" of the image.
    * @param negate true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def negate(): Sharp = js.native
  def negate(negate: Boolean): Sharp = js.native
  
  /**
    * Enhance output image contrast by stretching its luminance to cover the full dynamic range.
    * @param normalise true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def normalise(): Sharp = js.native
  def normalise(normalise: Boolean): Sharp = js.native
  
  /**
    * Alternative spelling of normalise.
    * @param normalize true to enable and false to disable (defaults to true)
    * @returns A sharp instance that can be used to chain operations
    */
  def normalize(): Sharp = js.native
  def normalize(normalize: Boolean): Sharp = js.native
  
  /**
    * Use these PNG options for output image.
    * PNG output is always full colour at 8 or 16 bits per pixel.
    * Indexed PNG input at 1, 2 or 4 bits per pixel is converted to 8 bits per pixel.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def png(): Sharp = js.native
  def png(options: PngOptions): Sharp = js.native
  
  /**
    * Force output to be raw, uncompressed uint8 pixel data.
    * @returns A sharp instance that can be used to chain operations
    */
  def raw(): Sharp = js.native
  
  /**
    * Recomb the image with the specified matrix.
    * @param inputMatrix 3x3 Recombination matrix
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def recomb(inputMatrix: Matrix3x3): Sharp = js.native
  
  //#region Channel functions
  /**
    * Remove alpha channel, if any. This is a no-op if the image does not have an alpha channel.
    * @returns A sharp instance that can be used to chain operations
    */
  def removeAlpha(): Sharp = js.native
  
  //#endregion
  //#region Resize functions
  /**
    * Resize image to width, height or width x height.
    *
    * When both a width and height are provided, the possible methods by which the image should fit these are:
    *  - cover: Crop to cover both provided dimensions (the default).
    *  - contain: Embed within both provided dimensions.
    *  - fill: Ignore the aspect ratio of the input and stretch to both provided dimensions.
    *  - inside: Preserving aspect ratio, resize the image to be as large as possible while ensuring its dimensions are less than or equal to both those specified.
    *  - outside: Preserving aspect ratio, resize the image to be as small as possible while ensuring its dimensions are greater than or equal to both those specified.
    *             Some of these values are based on the object-fit CSS property.
    *
    * When using a fit of cover or contain, the default position is centre. Other options are:
    *  - sharp.position: top, right top, right, right bottom, bottom, left bottom, left, left top.
    *  - sharp.gravity: north, northeast, east, southeast, south, southwest, west, northwest, center or centre.
    *  - sharp.strategy: cover only, dynamically crop using either the entropy or attention strategy. Some of these values are based on the object-position CSS property.
    *
    * The experimental strategy-based approach resizes so one dimension is at its target length then repeatedly ranks edge regions,
    * discarding the edge with the lowest score based on the selected strategy.
    *  - entropy: focus on the region with the highest Shannon entropy.
    *  - attention: focus on the region with the highest luminance frequency, colour saturation and presence of skin tones.
    *
    * Possible interpolation kernels are:
    *  - nearest: Use nearest neighbour interpolation.
    *  - cubic: Use a Catmull-Rom spline.
    *  - lanczos2: Use a Lanczos kernel with a=2.
    *  - lanczos3: Use a Lanczos kernel with a=3 (the default).
    *
    * @param width pixels wide the resultant image should be. Use null or undefined to auto-scale the width to match the height.
    * @param height pixels high the resultant image should be. Use null or undefined to auto-scale the height to match the width.
    * @param options resize options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def resize(): Sharp = js.native
  /**
    * Shorthand for resize(null, null, options);
    *
    * @param options resize options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def resize(options: ResizeOptions): Sharp = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: js.UndefOr[scala.Nothing], options: ResizeOptions): Sharp = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Double): Sharp = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Double, options: ResizeOptions): Sharp = js.native
  def resize(width: js.UndefOr[scala.Nothing], height: Null, options: ResizeOptions): Sharp = js.native
  def resize(width: Double): Sharp = js.native
  def resize(width: Double, height: js.UndefOr[scala.Nothing], options: ResizeOptions): Sharp = js.native
  def resize(width: Double, height: Double): Sharp = js.native
  def resize(width: Double, height: Double, options: ResizeOptions): Sharp = js.native
  def resize(width: Double, height: Null, options: ResizeOptions): Sharp = js.native
  def resize(width: Null, height: js.UndefOr[scala.Nothing], options: ResizeOptions): Sharp = js.native
  def resize(width: Null, height: Double): Sharp = js.native
  def resize(width: Null, height: Double, options: ResizeOptions): Sharp = js.native
  def resize(width: Null, height: Null, options: ResizeOptions): Sharp = js.native
  
  //#endregion
  //#region Operation functions
  /**
    * Rotate the output image by either an explicit angle or auto-orient based on the EXIF Orientation tag.
    *
    * If an angle is provided, it is converted to a valid positive degree rotation. For example, -450 will produce a 270deg rotation.
    *
    * When rotating by an angle other than a multiple of 90, the background colour can be provided with the background option.
    *
    * If no angle is provided, it is determined from the EXIF data. Mirroring is supported and may infer the use of a flip operation.
    *
    * The use of rotate implies the removal of the EXIF Orientation tag, if any.
    *
    * Method order is important when both rotating and extracting regions, for example rotate(x).extract(y) will produce a different result to extract(y).rotate(x).
    * @param angle angle of rotation. (optional, default auto)
    * @param options if present, is an Object with optional attributes.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def rotate(): Sharp = js.native
  def rotate(angle: js.UndefOr[scala.Nothing], options: RotateOptions): Sharp = js.native
  def rotate(angle: Double): Sharp = js.native
  def rotate(angle: Double, options: RotateOptions): Sharp = js.native
  
  /**
    * Sharpen the image.
    * When used without parameters, performs a fast, mild sharpen of the output image.
    * When a sigma is provided, performs a slower, more accurate sharpen of the L channel in the LAB colour space.
    * Separate control over the level of sharpening in "flat" and "jagged" areas is available.
    * @param sigma the sigma of the Gaussian mask, where sigma = 1 + radius / 2.
    * @param flat the level of sharpening to apply to "flat" areas. (optional, default 1.0)
    * @param jagged the level of sharpening to apply to "jagged" areas. (optional, default 2.0)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def sharpen(): Sharp = js.native
  def sharpen(sigma: js.UndefOr[scala.Nothing], flat: js.UndefOr[scala.Nothing], jagged: Double): Sharp = js.native
  def sharpen(sigma: js.UndefOr[scala.Nothing], flat: Double): Sharp = js.native
  def sharpen(sigma: js.UndefOr[scala.Nothing], flat: Double, jagged: Double): Sharp = js.native
  def sharpen(sigma: Double): Sharp = js.native
  def sharpen(sigma: Double, flat: js.UndefOr[scala.Nothing], jagged: Double): Sharp = js.native
  def sharpen(sigma: Double, flat: Double): Sharp = js.native
  def sharpen(sigma: Double, flat: Double, jagged: Double): Sharp = js.native
  
  /**
    * Access to pixel-derived image statistics for every channel in the image.
    * @returns A promise that resolves with a stats object
    */
  def stats(): js.Promise[Stats] = js.native
  /**
    * Access to pixel-derived image statistics for every channel in the image.
    * @returns A sharp instance that can be used to chain operations
    */
  def stats(callback: js.Function2[/* err */ js.Error, /* stats */ Stats, Unit]): Sharp = js.native
  
  /**
    * Any pixel value greather than or equal to the threshold value will be set to 255, otherwise it will be set to 0.
    * @param threshold a value in the range 0-255 representing the level at which the threshold will be applied. (optional, default 128)
    * @param options threshold options
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def threshold(): Sharp = js.native
  def threshold(threshold: js.UndefOr[scala.Nothing], options: ThresholdOptions): Sharp = js.native
  def threshold(threshold: Double): Sharp = js.native
  def threshold(threshold: Double, options: ThresholdOptions): Sharp = js.native
  
  /**
    * Use these TIFF options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def tiff(): Sharp = js.native
  def tiff(options: TiffOptions): Sharp = js.native
  
  /**
    * Use tile-based deep zoom (image pyramid) output.
    * Set the format and options for tile images via the toFormat, jpeg, png or webp functions.
    * Use a .zip or .szi file extension with toFile to write to a compressed archive file format.
    *
    * Warning: multiple sharp instances concurrently producing tile output can expose a possible race condition in some versions of libgsf.
    * @param tile tile options
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def tile(): Sharp = js.native
  def tile(tile: TileOptions): Sharp = js.native
  
  //#endregion
  //#region Color functions
  /**
    * Tint the image using the provided chroma while preserving the image luminance.
    * An alpha channel may be present and will be unchanged by the operation.
    * @param rgb Parsed by the color module to extract chroma values.
    * @returns A sharp instance that can be used to chain operations
    */
  def tint(rgb: Color): Sharp = js.native
  
  /**
    * Write output to a Buffer. JPEG, PNG, WebP, TIFF and RAW output are supported.
    * By default, the format will match the input image, except GIF and SVG input which become PNG output.
    * @param options resolve options
    * @param options.resolveWithObject Resolve the Promise with an Object containing data and info properties instead of resolving only with data.
    * @returns A promise that resolves with the Buffer data.
    */
  def toBuffer(): js.Promise[Buffer] = js.native
  /**
    * Write output to a Buffer. JPEG, PNG, WebP, TIFF and RAW output are supported.
    * By default, the format will match the input image, except GIF and SVG input which become PNG output.
    * @param callback Callback function called on completion with three arguments (err, buffer, info).
    * @returns A sharp instance that can be used to chain operations
    */
  def toBuffer(callback: js.Function3[/* err */ js.Error, /* buffer */ Buffer, /* info */ OutputInfo, Unit]): Sharp = js.native
  def toBuffer(options: ResolveWithObject): js.Promise[Buffer] = js.native
  /**
    * Write output to a Buffer. JPEG, PNG, WebP, TIFF and RAW output are supported.
    * By default, the format will match the input image, except GIF and SVG input which become PNG output.
    * @param options resolve options
    * @param options.resolveWithObject Resolve the Promise with an Object containing data and info properties instead of resolving only with data.
    * @returns A promise that resolves with an object containing the Buffer data and an info object containing the output image format, size (bytes), width, height and channels
    */
  def toBuffer(options: `0`): js.Promise[Data] = js.native
  
  /**
    * Alternative spelling of toColourspace().
    * @param colorspace output colorspace e.g. srgb, rgb, cmyk, lab, b-w ...
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def toColorspace(colorspace: String): Sharp = js.native
  
  /**
    * Set the output colourspace.
    * By default output image will be web-friendly sRGB, with additional channels interpreted as alpha channels.
    * @param colourspace output colourspace e.g. srgb, rgb, cmyk, lab, b-w ...
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def toColourspace(): Sharp = js.native
  def toColourspace(colourspace: String): Sharp = js.native
  
  /**
    * Write output image data to a file.
    * @param fileOut The path to write the image data to.
    * @throws {Error} Invalid parameters
    * @returns A promise that fulfills with an object containing informations on the resulting file
    */
  def toFile(fileOut: String): js.Promise[OutputInfo] = js.native
  //#endregion
  //#region Output functions
  /**
    * Write output image data to a file.
    * If an explicit output format is not selected, it will be inferred from the extension, with JPEG, PNG, WebP, TIFF, DZI, and libvips' V format supported.
    * Note that raw pixel data is only supported for buffer output.
    * @param fileOut The path to write the image data to.
    * @param callback Callback function called on completion with two arguments (err, info).  info contains the output image format, size (bytes), width, height and channels.
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def toFile(fileOut: String, callback: js.Function2[/* err */ js.Error, /* info */ OutputInfo, Unit]): Sharp = js.native
  
  /**
    * Force output to a given format.
    * @param format a String or an Object with an 'id' attribute
    * @param options output options
    * @throws {Error} Unsupported format or options
    * @returns A sharp instance that can be used to chain operations
    */
  def toFormat(format: String): Sharp = js.native
  def toFormat(format: String, options: GifOptions): Sharp = js.native
  def toFormat(format: String, options: JpegOptions): Sharp = js.native
  def toFormat(format: String, options: OutputOptions): Sharp = js.native
  def toFormat(format: String, options: PngOptions): Sharp = js.native
  def toFormat(format: String, options: TiffOptions): Sharp = js.native
  def toFormat(format: String, options: WebpOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: GifOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: JpegOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: OutputOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: PngOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: TiffOptions): Sharp = js.native
  def toFormat(format: AvailableFormatInfo, options: WebpOptions): Sharp = js.native
  
  /**
    * Trim "boring" pixels from all edges that contain values similar to the top-left pixel.
    * The info response Object will contain trimOffsetLeft and trimOffsetTop properties.
    * @param threshold The allowed difference from the top-left pixel, a number greater than zero. (optional, default 10)
    * @throws {Error} Invalid parameters
    * @returns A sharp instance that can be used to chain operations
    */
  def trim(): Sharp = js.native
  def trim(threshold: Double): Sharp = js.native
  
  /**
    * Use these WebP options for output image.
    * @param options Output options.
    * @throws {Error} Invalid options
    * @returns A sharp instance that can be used to chain operations
    */
  def webp(): Sharp = js.native
  def webp(options: WebpOptions): Sharp = js.native
  
  /**
    * Include all metadata (EXIF, XMP, IPTC) from the input image in the output image.
    * The default behaviour, when withMetadata is not used, is to strip all metadata and convert to the device-independent sRGB colour space.
    * This will also convert to and add a web-friendly sRGB ICC profile.
    * @param withMetadata
    * @throws {Error} Invalid parameters.
    */
  def withMetadata(): Sharp = js.native
  def withMetadata(withMetadata: WriteableMetadata): Sharp = js.native
}
