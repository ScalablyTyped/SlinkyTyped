package typingsSlinky.themeUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type AlertProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type Assign[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    */ typingsSlinky.themeUiComponents.themeUiComponentsStrings.Assign with org.scalablytyped.runtime.TopLevel[js.Any]
  type BadgeProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type BoxProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.div], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type ButtonProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.themeUiComponents.themeUiComponentsStrings.button], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type CardProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type CheckboxProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.input], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type CloseProps = typingsSlinky.themeUiComponents.mod.Omit[
    typingsSlinky.themeUiComponents.mod.IconButtonProps, 
    typingsSlinky.themeUiComponents.themeUiComponentsStrings.children
  ]
  type ContainerProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type DividerProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type FieldProps[T /* <: slinky.core.facade.ReactElement */] = typingsSlinky.themeUiComponents.mod.FieldOwnProps with (typingsSlinky.themeUiComponents.mod.Omit[
    typingsSlinky.react.mod.ComponentProps[T], 
    typingsSlinky.themeUiComponents.themeUiComponentsStrings.as | typingsSlinky.themeUiComponents.themeUiComponentsStrings.label | typingsSlinky.themeUiComponents.themeUiComponentsStrings.name
  ]) with typingsSlinky.themeUiComponents.anon.As[T]
  type FlexProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type FlexStyleProps = typingsSlinky.themeUiComponents.mod.BoxOwnProps
  type ForwardRef[T, P] = typingsSlinky.react.mod.ForwardRefExoticComponent[
    typingsSlinky.react.mod.PropsWithoutRef[P] with typingsSlinky.react.mod.RefAttributes[T]
  ]
  type HeadingProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.themeUiComponents.themeUiComponentsStrings.h2], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type IconButtonProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.themeUiComponents.themeUiComponentsStrings.button], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type ImageProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.img], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type InputProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.input], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type LabelProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.label], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type LinkProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentPropsWithRef[typingsSlinky.themeUiComponents.themeUiComponentsStrings.a], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type MenuButtonProps = typingsSlinky.themeUiComponents.mod.IconButtonProps
  type MessageProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type NavLinkProps = typingsSlinky.themeUiComponents.mod.LinkProps
  type Omit[T, K] = typingsSlinky.std.Pick[T, typingsSlinky.std.Exclude[/* keyof T */ java.lang.String, K]]
  type ProgressProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.progress], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type RadioProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.input], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type SelectProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.select], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type SliderProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.input], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
  type TextProps = typingsSlinky.themeUiComponents.mod.BoxProps
  type TextareaProps = typingsSlinky.themeUiComponents.mod.Assign[
    typingsSlinky.react.mod.ComponentProps[typingsSlinky.themeUiComponents.themeUiComponentsStrings.textarea], 
    typingsSlinky.themeUiComponents.mod.BoxOwnProps
  ]
}
