/*
 * OpenBench LogicSniffer / SUMP project 
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin St, Fifth Floor, Boston, MA 02110, USA
 *
 * Copyright (C) 2006-2010 Michael Poppitz, www.sump.org
 * Copyright (C) 2010 J.W. Janssen, www.lxtreme.nl
 */
package nl.lxtreme.ols.api.devices;


import java.io.*;
import nl.lxtreme.ols.api.acquisition.*;
import nl.lxtreme.ols.api.task.*;


/**
 * Denotes a device that we can talk to by calling {@link #call()} on it. The
 * implementation of that method should do all necessary tasks to acquire data
 * from the device and return that data in the form of an
 * {@link AcquisitionResult} object.
 */
public interface AcquisitionTask extends Task<AcquisitionResult>, Closeable
{
  // METHODS

  /**
   * Closes the device.
   * 
   * @throws IOException
   *           in case of I/O problems closing the device.
   */
  void close() throws IOException;

  /**
   * Opens the device for acquisition.
   * 
   * @throws IOException
   *           in case of I/O problems closing the device.
   */
  void open() throws IOException;

}
