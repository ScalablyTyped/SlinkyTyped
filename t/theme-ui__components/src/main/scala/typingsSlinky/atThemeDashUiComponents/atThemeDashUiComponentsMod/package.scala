package typingsSlinky.atThemeDashUiComponents

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object atThemeDashUiComponentsMod {
  import slinky.core.facade.ReactElement
  import typingsSlinky.atThemeDashUiComponents.Anon_As
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.a
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.as
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.button
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.children
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.div
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.h2
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.img
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.input
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.label
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.name
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.progress
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.select
  import typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.textarea
  import typingsSlinky.react.reactMod.ComponentProps
  import typingsSlinky.react.reactMod.ComponentPropsWithRef
  import typingsSlinky.react.reactMod.ForwardRefExoticComponent
  import typingsSlinky.react.reactMod.PropsWithoutRef
  import typingsSlinky.react.reactMod.RefAttributes
  import typingsSlinky.std.Omit

  type AlertProps = BoxProps
  type Assign[T, U] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T & U ]: P extends keyof T? T[P] : P extends keyof U? U[P] : never}
    */ typingsSlinky.atThemeDashUiComponents.atThemeDashUiComponentsStrings.Assign with js.Any
  type BadgeProps = BoxProps
  type BoxProps = Assign[ComponentProps[div], BoxOwnProps]
  type ButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
  type CardProps = BoxProps
  type CheckboxProps = Assign[ComponentProps[input], BoxOwnProps]
  type CloseProps = Omit[IconButtonProps, children]
  type ContainerProps = BoxProps
  type DividerProps = BoxProps
  type FieldProps[T /* <: ReactElement */] = FieldOwnProps with (Omit[ComponentProps[T], as | label | name]) with Anon_As[T]
  type FlexStyleProps = BoxOwnProps
  type ForwardRef[T, P] = ForwardRefExoticComponent[PropsWithoutRef[P] with RefAttributes[T]]
  type HeadingProps = Assign[ComponentPropsWithRef[h2], BoxOwnProps]
  type IconButtonProps = Assign[ComponentPropsWithRef[button], BoxOwnProps]
  type ImageProps = Assign[ComponentProps[img], BoxOwnProps]
  type InputProps = Assign[ComponentProps[input], BoxOwnProps]
  type LabelProps = Assign[ComponentProps[label], BoxOwnProps]
  type LinkProps = Assign[ComponentPropsWithRef[a], BoxOwnProps]
  type MenuButtonProps = IconButtonProps
  type MessageProps = BoxProps
  type NavLinkProps = LinkProps
  type ProgressProps = Assign[ComponentProps[progress], BoxOwnProps]
  type RadioProps = Assign[ComponentProps[input], BoxOwnProps]
  type SelectProps = Assign[ComponentProps[select], BoxOwnProps]
  type SliderProps = Assign[ComponentProps[input], BoxOwnProps]
  type TextProps = BoxProps
  type TextareaProps = Assign[ComponentProps[textarea], BoxOwnProps]
}
