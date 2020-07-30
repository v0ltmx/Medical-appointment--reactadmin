import React from 'react';
import {

  List,
  Datagrid,
  TextField,
  Create,
  SimpleForm,
  TextInput,
  Edit,
} from 'react-admin';

const ConsultList = props => (
  <List {...props}>
    <Datagrid rowClick="edit">
      <TextField source="id" />
      <TextField source="descricao" />
    </Datagrid>
  </List>
);

const ConsultEdit = props => (
  <Edit title={<span>Editar consulta</span>} {...props}>
    <SimpleForm>
      <TextInput source="name" />
         </SimpleForm>
  </Edit>
);


const ConsultCreate = props => (
  <Create title={<span>TADVIDA</span>} {...props}>
    <SimpleForm>
      <TextInput source="Nome paciente" />
      <TextInput source="Especialidade" />

    </SimpleForm>
  </Create>
);

export {ConsultList,ConsultEdit,ConsultCreate};