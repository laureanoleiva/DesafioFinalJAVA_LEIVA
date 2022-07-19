package com.desafiofinal_leiva.desafiofinal_leiva.Service;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.desafiofinal_leiva.desafiofinal_leiva.Entidad.Cliente
import com.desafiofinal_leiva.desafiofinal_leiva.Entidad.Comprobante;
import com.desafiofinal_leiva.desafiofinal_leiva.Entidad.Producto;
import com.desafiofinal_leiva.desafiofinal_leiva.Repository.ClienteRepository;
import com.desafiofinal_leiva.desafiofinal_leiva.Repository.ComprobanteRepository;
import com.desafiofinal_leiva.desafiofinal_leiva.Repository.ProductoRepository;

@Service
public class ComprobanteService {

    @Autowired
    private ComprobanteRepository comprobanteRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    @Autowired
    private ProductoRepository productoRepository;

    @Autowired
    private RestTemplate restTemplate;

}